import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Ser alterado, que operação matemática você deseja relizar:\n digite 1 para soma:  \n digite 2 para subtração:  \n digite 3 para divisão:  \n digite 4 para multiplicar:  \n");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.printf("a soma é: %.2f",calc.soma(num1,num2));
                break;
            case 2:
                System.out.printf("a subtração é: %.2f",calc.subtração(num1,num2));
                break;
            case 3:
                System.out.printf("a divisão é: %.2f",calc.divisão(num1,num2));
                break;
            case 4:
                System.out.printf("a multiplicação é: %.2f",calc.multiplicação(num1,num2));
                break;
            default:
                System.out.println("SER ALTERADO, MORRA!!!!!!!!!!!!!!!!!!");

        }


    }
}