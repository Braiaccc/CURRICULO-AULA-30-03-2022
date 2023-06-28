// Implementação da classe Fatura que implementa a interface Pagável
public class Fatura implements Pagável {
    @Override
    public void pagar() {
        System.out.println("A fatura foi paga.");
    }

    @Override
    public void verificarPagamento() {
        System.out.println("A fatura está paga.");
    }
}
