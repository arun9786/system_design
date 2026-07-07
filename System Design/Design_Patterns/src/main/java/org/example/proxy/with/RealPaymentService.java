package org.example.proxy.with;

import org.example.proxy.without.PaymentService;

public class RealPaymentService
        implements PaymentService {

    @Override
    public void transfer(double amount) {

        //Main Functionality
        System.out.println(
                "Transferring ₹" + amount
        );

    }
}