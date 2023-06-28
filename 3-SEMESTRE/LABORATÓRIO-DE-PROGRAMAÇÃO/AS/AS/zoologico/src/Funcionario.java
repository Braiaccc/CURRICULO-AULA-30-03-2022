//A classe Funcionario representa um funcionário de uma empresa, servindo como superclass para Veterinario
public class Funcionario {
    //Atributos da classe Funcionario
    private String nome;
    private String cargo;
    private double salario;

    //Métodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    //Construtor da classe
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
}
