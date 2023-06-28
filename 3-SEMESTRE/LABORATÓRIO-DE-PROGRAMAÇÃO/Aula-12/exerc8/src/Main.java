public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.pagar();
        fatura.verificarPagamento();

        Cheque cheque = new Cheque();
        cheque.pagar();
        cheque.verificarPagamento();

        Deposito deposito = new Deposito();
        deposito.pagar();
        deposito.verificarPagamento();
    }
}
