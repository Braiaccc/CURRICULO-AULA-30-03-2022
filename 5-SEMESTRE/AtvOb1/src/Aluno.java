public class Aluno {
    private String nome;
    private String matricula;
    private int idade;
    private String curso;

    public Aluno(String nome, String matricula, int idade, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.curso = curso;
    }

    String mostrarInfo(){
        return "Nome " + nome + "\nMatricula " + matricula + "\nIdade " + idade + "\nCurso " + curso;
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Bryan ", "me23", 21, "ads");

        System.out.println(aluno1.mostrarInfo());
    }
}
