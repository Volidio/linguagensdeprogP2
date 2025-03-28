package Questao03;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 1500.00, 10);

        produto.exibirEstoque();
        produto.adicionarEstoque(5);
        produto.vender(3);
        produto.exibirEstoque();
    }
}