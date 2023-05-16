class Conta {
    private double saldo;
    private String numero;

    public Conta(double saldo, String numero) {
        this.saldo = saldo;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }
}

class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(double saldo, String numero, double limite) {
        super(saldo, numero);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
}

  class Main4 {
    public static void main(String[] args) {
        Conta conta = new Conta(1000.0, "123456");
        ContaCorrente contaCorrente = new ContaCorrente(2000.0, "654321", 1000.0);

        System.out.println("Conta: " + conta.getNumero() + ", Saldo: " + conta.getSaldo());
        System.out.println("Conta Corrente: " + contaCorrente.getNumero() + ", Saldo: " + contaCorrente.getSaldo() + ", Limite: " + contaCorrente.getLimite());
    }
}

