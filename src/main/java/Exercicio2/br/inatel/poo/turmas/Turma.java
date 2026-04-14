package Exercicio2.br.inatel.poo.turmas;

public class Turma {

    private int quantidadeAlunos;
    private Aluno[] alunos;

    public Turma() {
        this.alunos = new Aluno[100];
        this.quantidadeAlunos = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
            System.out.println("Aluno \"" + aluno.getNome() + "\" adicionado com sucesso.");
        } else {
            System.out.println("Turma cheia! Não foi possível adicionar o aluno.");
        }
    }

    public void listarAlunos() {
        System.out.println("\nLista:");
        if (quantidadeAlunos == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        for (int i = 0; i < quantidadeAlunos; i++) {
            alunos[i].mostraInfo();
        }
    }

    public Aluno buscarMelhorAluno() {
        if (quantidadeAlunos == 0) return null;

        Aluno melhor = alunos[0];
        for (int i = 1; i < quantidadeAlunos; i++) {
            if (alunos[i].calculaMedia() > melhor.calculaMedia()) {
                melhor = alunos[i];
            }
        }
        return melhor;
    }
}