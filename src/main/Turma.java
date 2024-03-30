package main;

import java.util.HashSet;

public class Turma {
    private Professor professor;   // professor designado.
    private HashSet<Aluno> alunos; // conjunto de alunos.
    private int numero;            // número da turma.

    public Turma() {
        this.alunos = new HashSet<>();
        numero = 0;     // será configurado automaticamente.
    }

    public Turma(Professor professor) {
        this.professor = professor;
        this.alunos = new HashSet<>();
        numero = 0;     // será configurado automaticamente.
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public float calcularMediaDaTurma() {
        // Abrace o paradigma funcional
        return (float) alunos.stream()
                .mapToDouble(Aluno::calcularMedia)
                .sum() / alunos.size();
    }

    public void publicarNota(Aluno aluno, String prova, float nota) {
        // set nota de um aluno específico.
        return;
    }

    public void alocarProfessor(Professor professor) {
        this.professor = professor;
    }

    public void todasAsNotas() {
        // Retornar todas as notas dos alunos;
        return;
    }
}