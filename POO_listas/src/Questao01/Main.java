package Questao01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        double nota3 = sc.nextDouble();
        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        System.out.printf("Ser alterado, sua média é %.2f e seu atual status é %s ",aluno.Media(),aluno.Aprovacao());


    }
}
