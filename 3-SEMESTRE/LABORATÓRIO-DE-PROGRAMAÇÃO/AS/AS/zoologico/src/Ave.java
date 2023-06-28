//A classe Ave é uma subclass de Animal que implementa a interface Treinavel
public class Ave extends Animal implements Treinavel{
    //atributos da classe
    double envergaduraAsa;

    //Construtor da classe
    public Ave(String nome, int idade, double peso, String especie, double envergaduraAsa) {
        super(nome, idade, peso, especie);
        this.envergaduraAsa = envergaduraAsa;
    }

    //Método realizarTruque() realiza um truque da classe Ave, método pertencente a interface Treinavel
    @Override
    public void realizarTruque() {
        System.out.printf("%s (%s) realizou um truque voador\n", this.getEspecie(), this.getNome());
        //this.getEspecie() e this.getNome() são métodos herdados da classe Animal
    }

    //Método voar() escreve no console indicando que a ave esta voando
    public void voar(){
        System.out.printf("%s (%s) está voando\n", this.getEspecie(), this.getNome());
        //this.getEspecie() e this.getNome() são métodos herdados da classe Animal
    }
}
