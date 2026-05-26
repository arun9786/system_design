package org.example.openorclosed.correctcode;

class PaymentService {

    public void processPayment(PaymentMethod paymentMethod) {
        paymentMethod.pay();
    }
}
