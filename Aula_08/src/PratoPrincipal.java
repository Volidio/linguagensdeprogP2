public class PratoPrincipal extends Refeicao implements Preparacao{

    @Override
    public void preparar() {
        System.out.println("ta pegando fogo bixo, fudeu legal!");
    }

    @Override
    public void servir() {
        System.out.println("finge que tá tudo certo pra não perceberem que eu fiz merda");
    }

    @Override
    public void temperar() {
        System.out.println("sal e pimenta só meu calabreso, precisa inovar não");
    }

    @Override
    public void esquentar() {
        System.out.println("pode esquentar no forno que tá top");
    }
}
