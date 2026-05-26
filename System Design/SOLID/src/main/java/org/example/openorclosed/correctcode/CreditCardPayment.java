package org.example.openorclosed.correctcode;

class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Processing credit card payment");
    }
}