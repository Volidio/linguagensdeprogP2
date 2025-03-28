package Nota_aula3;

public class Main {
    public static void main(String[] args) {
        Cavalo cavalo = new Cavalo(140,"azul","munguingo");
        Gato gato = new Gato(200,"Laranja","gordo");
        System.out.printf("meu gato tem %.2f. kilos, sua cor %s e sua pelagem é do tipo %s \n", gato.getTamanho(),gato.getCor(),gato.getPelagem());
        System.out.printf(" Eu odeio cavalos, minha mãe sempre disse que eu não podia confiar neles.\n Um dia meu tio comprou um cavalo, Scrimblo Jones, ele tinha %.2f. kilos, sua cor %s, e sua raça %s. \n Eu odiava aquele cavalo, ele tentou me matar 5 vezes seguidas, mainha tinha razão, não se pode confiar neles. \n Essa é minha última mensagem, logo logo eles vão chegar, se alguem encontrar isso, SE ESCONDA \n", cavalo.getTamanho(),cavalo.getCor(),cavalo.getRaca());
        gato.miar();
        cavalo.fugir();
        gato.comer();
    }
}