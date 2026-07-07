package org.example.adapter.without;

public class StripePaymentGateway {

    public void makeStripePayment(
            long amountInPaise,
            String currency) {

        System.out.println(
                "Stripe payment processed"
        );

        System.out.println(
                "Amount: " + amountInPaise
        );

        System.out.println(
                "Currency: " + currency
        );
    }
}
