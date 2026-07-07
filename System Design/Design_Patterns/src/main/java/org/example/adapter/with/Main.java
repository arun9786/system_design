package org.example.adapter.with;

public class Main {

    public static void main(String[] args) {

        StripePaymentGateway stripeGateway =
                new StripePaymentGateway();

        PaymentProcessor processor =
                new StripePaymentAdapter(
                        stripeGateway
                );

        PaymentService service =
                new PaymentService(processor);

        service.makePayment(5000);
    }
}
