// Implementação da classe Guitarra que implementa a interface Musical
public class Guitarra implements Musical {
    @Override
    public void tocar() {
        System.out.println("A guitarra está tocando.");
    }

    @Override
    public void parar() {
        System.out.println("A guitarra parou de tocar.");
    }

    @Override
    public void pausar() {
        System.out.println("A guitarra foi pausada.");
    }
}
