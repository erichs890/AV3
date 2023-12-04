import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Cria uma lista de produtos
        ArrayList<Produto> produtos = new ArrayList<>();

        // Cria um scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Exibe o menu
            System.out.println("Menu");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Ver estoque");
            System.out.println("4 - Sair");

            // Lê a opção do usuário
            int opcao = scanner.nextInt();

            // Executa a ação correspondente à opção selecionada
            switch (opcao) {
                case 1:
                    // Adiciona um produto
                    adicionarProduto(produtos, scanner);
                    break;
                case 2:
                    // Remove um produto
                    removerProduto(produtos, scanner);
                    break;
                case 3:
                    // Exibe o estoque
                    exibirEstoque(produtos);
                    break;
                case 4:
                    // Sai do programa
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    // Adiciona um produto à lista
    private static void adicionarProduto(ArrayList<Produto> produtos, Scanner scanner) {
        // Lê o tipo do produto
        System.out.println("Digite o tipo do produto: \n 1 - Blusa \n 2- Calçado");
        String tipo = scanner.nextLine();

        // Lê a quantidade do produto
        System.out.println("Digite a quantidade do produto:");
        int quantidade = scanner.nextInt();

        // Cria um produto com o tipo e quantidade especificados
        Produto produto = new Produto(tipo, quantidade) {
            @Override
            public boolean verificarEstoque() throws EstoqueInsuficienteException {
                return false;
            }

            @Override
            public double calcularFrete() throws FreteIndisponivelException {
                return 0;
            }

            @Override
            public void aplicarPromoção() throws PromocaoInexistenteException {

            }
        };

        // Adiciona o produto à lista
        produtos.add(produto);

        System.out.println("Produto adicionado com sucesso!");
    }

    // Remove um produto da lista
    private static void removerProduto(ArrayList<Produto> produtos, Scanner scanner) {
        // Lê o índice do produto a ser removido
        System.out.println("Digite o índice do produto a ser removido:");
        int indice = scanner.nextInt();

        // Remove o produto da lista
        produtos.remove(indice);

        System.out.println("Produto removido com sucesso!");
    }

    // Exibe o estoque
    private static void exibirEstoque(ArrayList<Produto> produtos) {
        // Exibe o cabeçalho
        System.out.println("Estoque");
        System.out.println("----------------------------------------");

        for (Produto produto : produtos) {
            System.out.println("Tipo: " + produto.getTipo());
            System.out.println("Quantidade: " + produto.getQuantidadeEstoque());
        }
    }
}
