package org.example.openorclosed.correctcode;

public class Main {

    public static void main(String[] args) {

        PaymentService service = new PaymentService();

        service.processPayment(new CreditCardPayment());
        service.processPayment(new UpiPayment());

        //in future if want
        service.processPayment(new WalletPayment());
    }
}
