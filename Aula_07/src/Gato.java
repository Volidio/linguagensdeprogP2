public class Gato extends Animal{
    private String pelagem;
    private String mingonga;

    public String getMingonga() {
        return mingonga;
    }

    public void setMingonga(String mingonga) {
        this.mingonga = mingonga;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public Gato(float tamanho, String cor, String pelagem, String mingonga){
        super(tamanho,cor);
        this.pelagem=pelagem;
        this.mingonga=mingonga;
    }

    @Override
    public String toString(){
        return super.toString()+", Mingonga: "+ mingonga;
    }

    @Override
    public void comer (){
        System.out.println("a ração tá boa meu irmão");
    }

    void miar (){
        System.out.println("MEU ESPÍRITO É FRACO, ESTOU FADADO A PERMANECER NO CICLO DA REENCARNAÇÃO");
    }
}