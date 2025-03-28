package Questao04;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        ContaBancaria outraConta = new ContaBancaria();
        int opcao;

        do {
            System.out.println("\nMenu do Sistema Bancário:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$" + conta.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: R$");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Digite o valor do saque: R$");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 4:
                    System.out.print("Digite o valor para transferir: R$");
                    double valorTransferencia = scanner.nextDouble();
                    conta.transferir(outraConta, valorTransferencia);
                    break;
                case 5:
                    System.out.println("Encerrando o sistema bancário...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
