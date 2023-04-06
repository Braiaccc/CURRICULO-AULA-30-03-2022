package semi;

import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos;

    public Turma() {
        alunos = new ArrayList<Aluno>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public double calcularMedia() {
        double somaMedias = 0.0;
        for (Aluno aluno : alunos) {
            somaMedias += aluno.calcularMedia();
        }
        return somaMedias / alunos.size();
    }
}







