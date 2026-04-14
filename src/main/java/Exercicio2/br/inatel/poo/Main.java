package Exercicio2.br.inatel.poo;

import Exercicio2.br.inatel.poo.turmas.Aluno;
import Exercicio2.br.inatel.poo.turmas.Turma;

public class Main {

    public static void main(String[] args) {
        Turma turma = new Turma();

        Aluno aluno1 = new Aluno("Ana Silva",    "2026001", new double[]{8.5, 9.0, 7.5, 8.0});
        Aluno aluno2 = new Aluno("Bruno Costa",  "2026002", new double[]{6.0, 7.0, 6.5, 5.5});
        Aluno aluno3 = new Aluno("Carla Mendes", "2026003", new double[]{9.5, 9.0, 10.0, 9.5});

        System.out.println("ADICIONANDO ALUNOS");
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);
        turma.listarAlunos();
        Aluno melhor = turma.buscarMelhorAluno();
        if (melhor != null) {
            System.out.println("\no melhor aluno: ");
            System.out.println("Nome: " + melhor.getNome());
            System.out.printf("Média: %.2f%n", melhor.calculaMedia());
        }
    }
}