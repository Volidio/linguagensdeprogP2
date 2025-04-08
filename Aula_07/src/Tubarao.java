public final class Tubarao extends Animal{
    private String nome;
    public TiposDeAnimal tiposDeAnimal;

    public TiposDeAnimal getTiposDeAnimal() {
        return tiposDeAnimal;
    }

    public void setTiposDeAnimal(TiposDeAnimal tiposDeAnimal) {
        this.tiposDeAnimal = tiposDeAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tubarao(float tamanho, String cor, String nome) {
        super(tamanho, cor);
        this.nome=nome;
    }

    @Override
    public void comer(){
        System.out.println("TRALALERO TRALALA");
    }

    
}
