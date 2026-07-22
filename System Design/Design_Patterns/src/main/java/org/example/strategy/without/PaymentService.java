package org.example.strategy.without;

public class PaymentService {

    public void processPayment(String paymentType, double amount) {

        if (paymentType.equals("CREDIT_CARD")) {
            new CreditCardPayment().pay(amount);
        } else if (paymentType.equals("UPI")) {
            new UpiPayment().pay(amount);

        } else if (paymentType.equals("NET_BANKING")) {
            new NetBankingPayment().pay(amount);
        } else {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }
}
