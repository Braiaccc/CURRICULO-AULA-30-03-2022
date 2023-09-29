abstract public class Conta {
    private int numeroConta;
    private double saldo;
    private Cliente cliente;
    abstract public void deposita();
    abstract public void transfere();
    abstract public void consultaSaldo();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}