package semi;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.adicionarProva(new Prova(4.0, 2.5));
        aluno1.adicionarProva(new Prova(1.0, 7.0));

        Aluno aluno2 = new Aluno();
        aluno2.adicionarProva(new Prova(6.5, 3.5));
        aluno2.adicionarProva(new Prova(0.0, 3.0));

        Aluno aluno3 = new Aluno();
        aluno3.adicionarProva(new Prova(5.0, 4.0));
        aluno3.adicionarProva(new Prova(6.0, 1.5));

        Turma turma = new Turma();
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);

        System.out.println("Média da turma: " + turma.calcularMedia());

        System.out.println("Média do aluno 1: " + aluno1.calcularMedia());
        System.out.println("Média do aluno 2: " + aluno2.calcularMedia());
        System.out.println("Média do aluno 3: " + aluno3.calcularMedia());
    }
}
