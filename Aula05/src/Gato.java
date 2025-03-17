public class Gato extends Animal{
    private String pelagem;

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public Gato(float tamanho, String cor, String pelagem){
        super(tamanho,cor);
        this.pelagem=pelagem;
    }

    void miar (){

    }
}
