// Implementação da classe Passaro que implementa a interface Voador
public class Passaro implements Voador {
    @Override
    public void decolar() {
        System.out.println("Pássaro decolando...");
    }

    @Override
    public void voar() {
        System.out.println("Pássaro voando...");
    }

    @Override
    public void aterrar() {
        System.out.println("Pássaro aterrando...");
    }
}
