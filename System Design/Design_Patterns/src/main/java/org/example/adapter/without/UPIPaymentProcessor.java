package org.example.adapter.without;

public class UPIPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("UPI Payment Processor");
    }
}
