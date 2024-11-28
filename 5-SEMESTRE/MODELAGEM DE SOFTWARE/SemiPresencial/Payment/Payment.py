# Sistema de pagamento existente
class ExistingPaymentSystem:
    def process_payment(self, amount):
        print(f"Processando pagamento de {amount} através do sistema existente.")

# Nova biblioteca de pagamento
class NewPaymentLibrary:
    def make_payment(self, money):
        print(f"Realizando pagamento de {money} através da nova biblioteca.")

# Adaptador que permite que a nova biblioteca funcione com o sistema existente
class PaymentAdapter:
    def __init__(self, new_payment_library):
        self.new_payment_library = new_payment_library

    def process_payment(self, amount):
        self.new_payment_library.make_payment(amount)

# Uso do adaptador
if __name__ == "__main__":
    # Sistema existente
    existing_payment = ExistingPaymentSystem()
    existing_payment.process_payment(100)

    # Nova biblioteca adaptada para o sistema existente
    new_payment = NewPaymentLibrary()
    adapted_payment = PaymentAdapter(new_payment)
    adapted_payment.process_payment(200)
