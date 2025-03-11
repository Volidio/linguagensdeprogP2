public class Produto {

    private int codigo;
    private String nome;
    private double tamanho_peso;
    private String cor;
    private double valor;
    private int quantidade;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }

    public void setTamanho_peso(double tamanho_peso){
        this.tamanho_peso=tamanho_peso;
    }
    public double getTamanho_peso(){
        return tamanho_peso;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }

    public void setValor(double valor){
        this.valor=valor;
    }
    public double getValor(){
        return valor;
    }

    public void setQuantidade(int quantidade){
        this.quantidade=quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }
}
