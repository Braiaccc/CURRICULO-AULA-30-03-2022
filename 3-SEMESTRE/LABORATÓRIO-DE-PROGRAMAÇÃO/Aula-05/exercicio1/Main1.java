package exercicio1;

public class Main1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30, 1.75);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());

        pessoa.setNome("Maria");
        pessoa.setIdade(25);
        pessoa.setAltura(1.60);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());
    }
}

