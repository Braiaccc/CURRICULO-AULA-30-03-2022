//Classe Mamifero é uma subclass da classe Animal
public class Mamifero extends Animal{
    //Atributos da classe Mamifero
    String tipoPelagem;

    //Construtor da classe
    public Mamifero(String nome, int idade, double peso, String especie, String tipoPelagem) {
        super(nome, idade, peso, especie);
        this.tipoPelagem = tipoPelagem;
    }

    //Método amamentar() imprime uma string para o console indicando que o mamifero esta amamentando
    public void amamentar(){
        System.out.printf("O mamifero '%s' está amamentando\n", this.getNome());
        //this.getNome() é um método getter herdado da classe Animal
    }
}
