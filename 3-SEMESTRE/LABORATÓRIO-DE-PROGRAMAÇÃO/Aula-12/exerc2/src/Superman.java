// Implementação da classe Superman que implementa a interface Voador
public class Superman implements Voador {
    @Override
    public void decolar() {
        System.out.println("Superman decolando...");
    }

    @Override
    public void voar() {
        System.out.println("Superman voando...");
    }

    @Override
    public void aterrar() {
        System.out.println("Superman aterrando...");
    }
}
