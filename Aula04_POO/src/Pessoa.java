public class Pessoa {
    private String nome;
    private int idade;

    private double altura;
    public void niver() {
        idade++;
    }
    public void setIdade(int idade){
        this.idade=idade;
    }
    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }

    public void setAltura (double altura){
        this.altura=altura;
    }
    public double getAltura (){
        return altura;
    }
}