//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import controller.ProfessorController;
import model.Professor;
import service.ProfessorService;

import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        ProfessorController professorController = new ProfessorController();
        Professor prof = new Professor();

        System.out.println("nome do prof");
        prof.setNome(sc.nextLine());
        System.out.println("idade do prof");
        prof.setIdade(sc.nextInt());
        System.out.println("especialização do prof");
        prof.setEspecializacao(sc2.nextLine());

        professorController.cadastrarProfessor(prof);

        System.out.println(professorController.listarProfessores());
    }
}