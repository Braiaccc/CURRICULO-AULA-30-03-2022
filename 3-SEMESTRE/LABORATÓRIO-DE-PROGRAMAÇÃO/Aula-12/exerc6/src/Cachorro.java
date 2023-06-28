// Implementação da classe Cachorro que implementa a interface Animal
public class Cachorro implements Animal {
    @Override
    public void comer() {
        System.out.println("O cachorro está comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("O cachorro está dormindo.");
    }
}
