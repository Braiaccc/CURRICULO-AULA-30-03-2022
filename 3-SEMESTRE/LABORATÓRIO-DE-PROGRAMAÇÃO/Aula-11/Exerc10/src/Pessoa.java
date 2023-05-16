public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, int idade, String cargo) {
        super(nome, idade);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}

 class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);
        Funcionario funcionario = new Funcionario("Maria", 25, "Gerente");

        System.out.println("Pessoa: " + pessoa.getNome() + ", " + pessoa.getIdade());
        System.out.println("Funcionário: " + funcionario.getNome() + ", " + funcionario.getIdade() + ", " + funcionario.getCargo());
    }
}

