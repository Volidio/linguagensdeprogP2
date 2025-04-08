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
        System.out.println("Humano tolo você pensava mesmo que eu iria fugir");
    }

    @Override
    public void comer (){
        System.out.println("eu irei consumir a carne dos jovens para me tornar mais forte");
    }
}