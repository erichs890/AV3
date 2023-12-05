import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Cria variáveis para representar os produtos
        Produto[] produtos = new Produto[10]; // Pode ajustar o tamanho conforme necessário

        // Cria um scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        int indice = 0; // Índice para controlar a posição dos produtos no array

        while (true) {
            // Exibe o menu
            System.out.println("Bem-vindo à loja de roupa generica");
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
                    indice = adicionarProduto(produtos, indice, scanner);
                    break;
                case 2:
                    // Remove um produto
                    indice = removerProduto(produtos, indice, scanner);
                    break;
                case 3:
                    // Exibe o estoque
                    exibirEstoque(produtos, indice);
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

    private static int adicionarProduto(Produto[] produtos, int indice, Scanner scanner) {
        // Lê o tipo do produto
        System.out.println("Digite o tipo do produto (Blusa, Calçado):");
        String tipo = scanner.next();

        // Lê as demais informações do produto
        System.out.println("Digite a quantidade:");
        int quantidade = scanner.nextInt();

        System.out.println("Digite a cor:");
        String cor = scanner.next();

        // Verifica se o tipo do produto é "Calçado"
        if (tipo.equals("Calçado")) {
            // Pergunta se é chinelo
            System.out.println("É chinelo? (S/N)");
            String respostaChinelo = scanner.next();
            boolean eChinelo = respostaChinelo.equalsIgnoreCase("s");

            // Lê o número
            System.out.println("Digite o número do pé:");
            int numero = scanner.nextInt();

            // Limpar o buffer
            scanner.nextLine();

            // Cria um produto calçado (pode ser Chinelo)
            produtos[indice] = eChinelo ?
                    new Chinelo(tipo, quantidade, cor, numero) :
                    new Calcado(tipo, quantidade, cor, numero, true) { // Se não for chinelo, assume que tem cadarço
                        @Override
                        public boolean estaValido() {
                            return false;
                        }
                    };
        } else {
            // Se não for calçado, lê o tamanho
            System.out.println("Digite o tamanho:");
            String tamanho = scanner.next();

            // Cria um produto genérico
            produtos[indice] = new Produto(tipo, quantidade) {
                @Override
                public boolean verificarEstoque() {
                    return false;
                }

                @Override
                public double calcularFrete() {
                    return 0;
                }

                @Override
                public void aplicarPromocao() {

                }
            };
        }

        System.out.println("Produto adicionado com sucesso!");
        return indice + 1; // Atualiza o índice para a próxima posição
    }



    private static int removerProduto(Produto[] produtos, int indice, Scanner scanner) {
        // Exibe o estoque atual
        exibirEstoque(produtos, indice);

        // Lê a posição do produto a ser removido
        System.out.println("Digite a posição do produto a ser removido:");
        int posicao = scanner.nextInt();

        if (posicao >= 0 && posicao < indice) {
            // Remove o produto da posição especificada
            System.arraycopy(produtos, posicao + 1, produtos, posicao, indice - posicao - 1);
            System.out.println("Produto removido com sucesso!");
            return indice - 1; // Atualiza o índice para a posição anterior
        } else {
            System.out.println("Posição inválida!");
            return indice;
        }
    }

    private static void exibirEstoque(Produto[] produtos, int indice) {
        // Exibe o cabeçalho
        System.out.println("Estoque");
        System.out.println("----------------------------------------");

        for (int i = 0; i < indice; i++) {
            System.out.println("Posição: " + i);
            System.out.println("Tipo: " + produtos[i].getTipo());
            System.out.println("Quantidade: " + produtos[i].getQuantidadeEstoque());
        }
    }
}
