public class Main {
    public static void main(String[] args) {
        Tubarao tubarao = new Tubarao(200,"Azul","TRALALELO TRALALA");
        Cavalo cavalo = new Cavalo(140,"azul","munguingo");
        Gato gato = new Gato(200,"Laranga","Gordo","Munganga");
        Veterinario veterinario = new Veterinario("Dr Marcelo High Quality",gato,cavalo);
        tubarao.setTiposDeAnimal(TiposDeAnimal.Oviparo);
//        System.out.printf("meu gato tem %.2f. kilos, sua cor %s e sua pelagem é do tipo %s \n", gato.getTamanho(),gato.getCor(),gato.getPelagem());
//        System.out.printf("eu odeio cavalos, minha mãe sempre disse que eu não podia confiar neles.\n Um dia meu tio comprou um cavalo, Scrimblo Jones, ele tinha %.2f. kilos, sua cor %s, e sua raça %s. \n Eu odiava aquele cavalo, ele tentou me matar 5 vezes seguidas, mainha tinha razão, não se pode confiar neles. \n Essa é minha última mensagem, logo logo eles vão chegar, se alguem encontrar isso, SE ESCONDA", cavalo.getTamanho(),cavalo.getCor(),cavalo.getRaca());

        System.out.println("informações sobre o gato cheio de munganga");
        System.out.println(gato);
        System.out.println("Você será atendido pelo nosso melhor veterinário: \n");
        System.out.println(veterinario);

        tubarao.comer();
        cavalo.comer();
        gato.comer();

        System.out.println(tubarao.getTiposDeAnimal());
    }
}