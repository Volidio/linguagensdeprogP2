import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Nome:");
        p.nome=sc.nextLine();

        System.out.println("Idade: ");
        p.idade=sc.nextInt();

        System.out.println("Altura:");
        p.altura=sc.nextDouble();

        System.out.println("Parabéns ser alterado, mais um ano sofrendo no plano material!!");
        p.niver();
        System.out.printf("Você tem %d anos de existencia nesse plano, teu nome %s, teu tamanho %.2f. \n",p.idade,p.nome,p.altura );

        System.out.println("Ser alterado, você está para sempre fadado a permanecer no ciclo da reencarnação e do sofrimento. Teu espírito é fraco, nunca irá atingir agnose.");

//        System.out.println("antiga: "+p.idade);
//        p.niver();
//        System.out.println("atual: "+p.idade);

    }
}
