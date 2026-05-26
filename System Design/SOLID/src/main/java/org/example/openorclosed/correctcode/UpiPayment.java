package org.example.openorclosed.correctcode;

class UpiPayment implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Processing UPI payment");
    }
}
