package Questao01;

public class Aluno {
    private String nome;
    private double nota1, nota2, nota3;
    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public double Media() {
        return (nota1 + nota2 + nota3) / 3;
    }
    public String Aprovacao() {
        double media = Media();
        if (media >= 70) {
            return "Aprovado";
        } else if (media < 60) {
            return "Reprovado";
        }else{
            return "Final";
        }
    }
}
