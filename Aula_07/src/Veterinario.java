public class Veterinario {
    private String nome;
    private Gato gato;
    private Cavalo cavalo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Gato getGato() {
        return gato;
    }

    public void setGato(Gato gato) {
        this.gato = gato;
    }

    public Cavalo getCavalo() {
        return cavalo;
    }

    public void setCavalo(Cavalo cavalo) {
        this.cavalo = cavalo;
    }

    public Veterinario(String nome, Gato gato, Cavalo cavalo) {
        this.nome = nome;
        this.gato = gato;
        this.cavalo = cavalo;
    }

    public void veterinarioGato(Gato gato){
        this.gato=gato;
    }
    public void coiceDeCavalo(Cavalo cavalo){
        this.cavalo=cavalo;
    }

    @Override
    public String toString(){
        return """
                Veterinario: %s
                Raça do vacalo: %s
                Mingonga: %s
                """.formatted(this.nome,cavalo.getRaca(),gato.getMingonga());
    }
}
