public class Estudante {
    private String nome;
    private int matricula;
    private String curso;

    public Estudante(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public Estudante(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = "Curso não informado";
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("João", 123456, "Ciência da Computação");
        Estudante estudante2 = new Estudante("Maria", 789012);

        // imprimir informações dos estudantes
        System.out.println("Nome: " + estudante1.getNome() + ", Matrícula: " + estudante1.getMatricula() + ", Curso: " + estudante1.getCurso());
        System.out.println("Nome: " + estudante2.getNome() + ", Matrícula: " + estudante2.getMatricula() + ", Curso: " + estudante2.getCurso());
    }
}

