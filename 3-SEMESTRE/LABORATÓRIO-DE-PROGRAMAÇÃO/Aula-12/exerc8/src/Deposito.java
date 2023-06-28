// Implementação da classe Deposito que implementa a interface Pagável
public class Deposito implements Pagável {
    @Override
    public void pagar() {
        System.out.println("O depósito foi efetuado.");
    }

    @Override
    public void verificarPagamento() {
        System.out.println("O depósito foi processado.");
    }
}
