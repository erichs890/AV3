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
    // Adiciona um produto à lista
    // Adiciona um produto à lista
    // Adiciona um produto à lista
    private static void adicionarProduto(ArrayList<Produto> produtos, Scanner scanner) {
        // Lê o tipo do produto
        System.out.println("Digite o tipo do produto (Blusa, Calçado):");
        String tipo = scanner.nextLine();

        // Lê as demais informações do produto
        System.out.println("Digite a quantidade:");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Digite o tamanho:");
        String tamanho = scanner.nextLine();

        System.out.println("Digite a cor:");
        String cor = scanner.nextLine();

        // Verifica se o tipo do produto é "Calçado"
        if (tipo.equals("Calçado")) {
            // Lê o número
            System.out.println("Digite o número:");
            int numero = scanner.nextInt();

            // Limpar o buffer
            scanner.nextLine();

            // Verifica se o calçado tem cadarço
            System.out.println("O calçado tem cadarço? (S/N)");
            String resposta = scanner.nextLine();
            boolean temCadarco = resposta.equalsIgnoreCase("s");

            // Cria um produto calçado
            Calcado produto = new Calcado(tipo, quantidade, tamanho, cor, numero) {
                @Override
                public boolean estaValido() {
                    return false;
                }
            };

            // Adiciona o produto à lista
            produtos.add(produto);

            System.out.println("Produto adicionado com sucesso!");
        } else {
            // Cria um produto genérico
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
                public void aplicarPromocao() throws PromocaoInexistenteException {

                }
            };

            // Adiciona o produto à lista
            produtos.add(produto);

            System.out.println("Produto adicionado com sucesso!");
        }
    }

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
