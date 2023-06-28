//A classe Animal representa um animal do zoológico, serve de superclass para Ave e Mamifero
public class Animal {
    //Atributos da classe
    private String nome;
    private int idade;
    private double peso;
    private String especie;

    //Construtor da classe
    public Animal(String nome, int idade, double peso, String especie){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.especie = especie;
    }

    //Métodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    //Método moviventar() realiza o movimento do animal
    public void movimentar(){
        System.out.printf("%s (%s) se moveu\n", this.especie, this.nome);
    }
    //Método movimentar(String movimento) realiza o movimento do animal de forma específica, somente se um parâmetro for passado na função
    public void movimentar(String movimento){
        System.out.printf("%s (%s) se moveu de forma específica - Ação feita: %s\n", this.especie, this.nome, movimento);
    }

}
