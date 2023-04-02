package exercicio3;

public class Main {
    public static void main(String[] args) {
        Pessoa titular = new Pessoa("João", 30, 1.75);
        ContaBancaria conta = new ContaBancaria("1234", 1000.0, titular);

        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());

        conta.depositar(500.0);
        System.out.println("Novo saldo após depósito: " + conta.getSaldo());

        conta.sacar(2000.0);
        System.out.println("Saldo após tentativa de saque de 2000.0: " + conta.getSaldo());

        conta.sacar(500.0);
        System.out.println("Novo saldo após saque de 500.0: " + conta.getSaldo());
    }
}