package Nota_aula3;

public class Cavalo extends Animal{
    private String raca;
    public Cavalo(float tamanho, String cor, String raca){
        super(tamanho,cor);
        this.raca=raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    void fugir(){
        System.out.println("Ser alterado, você pensa mesmo que eu iria fugir de você? Patético.");
    }
}