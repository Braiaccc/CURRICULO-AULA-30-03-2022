// Implementação da classe Cheque que implementa a interface Pagável
public class Cheque implements Pagável {
    @Override
    public void pagar() {
        System.out.println("O cheque foi pago.");
    }

    @Override
    public void verificarPagamento() {
        System.out.println("O cheque foi compensado.");
    }
}
