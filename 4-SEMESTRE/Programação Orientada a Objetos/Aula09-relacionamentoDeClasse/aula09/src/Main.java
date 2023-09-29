public class Main {
    public static void main(String[] args) {

        Cliente bryan = new Cliente("Bryan", 25);
        Cliente daniel = new Cliente("Daniel", 35);

        ContaCorrente conta = new ContaCorrente(bryan);

        ContaCorrente conta2 = new ContaCorrente(daniel);

        ContaPoupança contaP1 = new ContaPoupança(bryan);

        conta2.setNumeroConta(424);
        conta.setNumeroConta(949);

        System.out.println(conta.getCliente().getNome());
        System.out.println(conta.getNumeroConta());
        System.out.println(conta2.getCliente().getNome());
        System.out.println(conta2.getNumeroConta());
    }
}