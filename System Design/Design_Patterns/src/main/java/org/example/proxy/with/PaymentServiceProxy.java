package org.example.proxy.with;

public class PaymentServiceProxy
        implements PaymentService {

    private final PaymentService realService;

    public PaymentServiceProxy(
            PaymentService realService) {

        this.realService = realService;
    }

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

        realService.transfer(amount);

        System.out.println(
                "Audit log after transfer"
        );
    }
}
