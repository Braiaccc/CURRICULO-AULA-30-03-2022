//A classe Veterinário é uma subclass da classe Funcionario
public class Veterinario extends Funcionario{
    //Atributos da classe
    String especialidade;
    //Construtor da classe
    public Veterinario(String nome, String cargo, double salario, String especialidade) {
        super(nome, cargo, salario);
        this.especialidade = especialidade;
    }
    //O método realizarExame(Animal animal) recebe um objeto do tipo Animal como parâmetro
    public void realizarExame(Animal animal){
        System.out.printf("O veterinário '%s' está realizando um exame no animal '%s' | Espécie: %s\n", this.getNome(), animal.getNome(), animal.getEspecie());
        // this.getNome() é um método herdado da superclass Funcionario, animal.getNome() e animal.getEspecie() são métodos da instância animal passada como parâmetro
    }
}
