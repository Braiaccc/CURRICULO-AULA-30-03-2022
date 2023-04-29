public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.idade = 0;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public static void main(String[] args) {
        // Criando objetos do tipo "Cachorro"
        Cachorro cachorro1 = new Cachorro("Tobby", "Poodle", 5);
        Cachorro cachorro2 = new Cachorro("Lulu", "Bulldog");

        // Imprimindo os atributos dos objetos criados
        System.out.println("Nome: " + cachorro1.getNome() + ", Raça: " + cachorro1.getRaca() + ", Idade: " + cachorro1.getIdade());
        System.out.println("Nome: " + cachorro2.getNome() + ", Raça: " + cachorro2.getRaca() + ", Idade: " + cachorro2.getIdade());
    }
}



