// Implementação da classe Atleta que implementa as interfaces Andador e Corredor
public class Atleta implements Andador, Corredor {
    @Override
    public void andar() {
        System.out.println("O atleta está andando.");
    }

    @Override
    public void correr() {
        System.out.println("O atleta está correndo.");
    }
}
