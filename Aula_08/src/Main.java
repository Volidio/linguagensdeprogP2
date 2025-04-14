//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Refeicao e = new Entrada();
        Refeicao p = new PratoPrincipal();
        Refeicao s = new Sobremesa();

        ((Preparacao)e).temperar();
        ((Preparacao)e).esquentar();
        e.preparar();
        e.servir();

        ((Preparacao)p).temperar();
        ((Preparacao)p).esquentar();
        p.preparar();
        p.servir();

        s.preparar();
        s.servir();


    }
}