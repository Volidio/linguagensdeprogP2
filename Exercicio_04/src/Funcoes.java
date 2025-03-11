import java.util.Scanner;
public class Funcoes {
    Scanner sc = new Scanner(System.in);
    Produto p = new Produto();
    public  void cadastro (int codigo, String nome, double valor, int quatidade, String cor, double tamanho_peso){

        System.out.println("Código:");
        p.setCodigo(sc.nextInt());

        System.out.println("Nome:");
        p.setNome(sc.nextLine());

        System.out.println("Valor:");
        p.setValor(sc.nextDouble());

        System.out.println("Quantidade:");
        p.setQuantidade(sc.nextInt());

        System.out.println("Cor:");
        p.setCor(sc.nextLine());

        System.out.println("Peso/Tamanho:");
        p.setTamanho_peso(sc.nextDouble());

    }

    public void venda (){
        System.out.println("Digite o código do produto desejado");

    }
}
