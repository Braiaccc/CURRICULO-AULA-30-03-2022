public class Veterinario extends Funcionario {
    private String especialidade;

    public Veterinario(String nome, String cargo, double salario, String especialidade) {
        super(nome, cargo, salario);
        this.especialidade = especialidade;
    }

    public void realizarExame(Animal animal) {
        System.out.println("O veterinário está realizando um exame no(a) " + animal.getNome());
    }

    // getter e setter

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
