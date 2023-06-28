// Implementação da classe Aviao que implementa a interface Voador
public class Aviao implements Voador {
    @Override
    public void decolar() {
        System.out.println("Avião decolando...");
    }

    @Override
    public void voar() {
        System.out.println("Avião voando...");
    }

    @Override
    public void aterrar() {
        System.out.println("Avião aterrando...");
    }
}
