package org.example.proxy.without;

public class RealPaymentService
        implements PaymentService {

    @Override
    public void transfer(double amount) {

        System.out.println(
                "Checking authentication..."
        );

        System.out.println(
                "Checking authorization..."
        );

        System.out.println(
                "Audit log before transfer"
        );

        //Main Functionality
        System.out.println(
                "Transferring ₹" + amount
        );

        System.out.println(
                "Audit log after transfer"
        );
    }
}