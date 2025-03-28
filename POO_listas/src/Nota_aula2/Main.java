package Nota_aula2;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Produto produto = null;

    public static void main(String[] args) {
        while (true) {
            System.out.println("1 - Cadastrar produto\n2 - Vender produto\n3 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    venderProduto();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void cadastrarProduto() {
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Tamanho/Peso: ");
        String tamanhoPeso = scanner.nextLine();
        System.out.print("Cor: ");
        String cor = scanner.nextLine();
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        produto = new Produto(codigo, nome, tamanhoPeso, cor, valor, quantidade);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void venderProduto() {
        if (produto == null) {
            System.out.println("Nenhum produto cadastrado!");
            return;
        }

        System.out.print("Quantidade a vender: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        if (quantidade > produto.getQuantidade()) {
            System.out.println("Estoque insuficiente!");
            return;
        }

        System.out.print("Forma de pagamento (Pix, Espécie, Transferência, Débito, Crédito): ");
        String pagamento = scanner.nextLine().toLowerCase();
        double valorFinal = produto.getValor() * quantidade;

        if (pagamento.equals("pix") || pagamento.equals("espécie") || pagamento.equals("transferência") || pagamento.equals("débito")) {
            valorFinal *= 0.95;
        }

        System.out.println("Total a pagar: R$" + valorFinal);

        if (pagamento.equals("espécie")) {
            System.out.print("Valor entregue: ");
            double valorPago = scanner.nextDouble();
            scanner.nextLine();

            if (valorPago >= valorFinal) {
                System.out.println("Troco: R$" + (valorPago - valorFinal));
            } else {
                System.out.println("Valor insuficiente!");
                return;
            }
        }

        produto.setQuantidade(produto.getQuantidade() - quantidade);
        System.out.println("Venda realizada com sucesso!");
    }
}

