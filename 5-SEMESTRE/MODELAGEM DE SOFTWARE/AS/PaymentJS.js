// Sistema de pagamento existente
class ExistingPaymentSystem {
    processPayment(amount) {
      console.log(`Processando pagamento de ${amount} através do sistema existente.`);
    }
  }
  
  // Nova biblioteca de pagamento
  class NewPaymentLibrary {
    makePayment(money) {
      console.log(`Realizando pagamento de ${money} através da nova biblioteca.`);
    }
  }
  
  // Adaptador que permite que a nova biblioteca funcione com o sistema existente
  class PaymentAdapter {
    constructor(newPaymentLibrary) {
      this.newPaymentLibrary = newPaymentLibrary;
    }
  
    processPayment(amount) {
      this.newPaymentLibrary.makePayment(amount);
    }
  }
  
  // Uso do adaptador
  const existingPayment = new ExistingPaymentSystem();
  existingPayment.processPayment(100);
  
  const newPayment = new NewPaymentLibrary();
  const adaptedPayment = new PaymentAdapter(newPayment);
  adaptedPayment.processPayment(200);
  