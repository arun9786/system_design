package org.example.adapter;

public class UPIPaymentProcessor implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        //UPI Payment functionality
        System.out.println("UPI Payment is processing...");
    }
}
