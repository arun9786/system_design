package org.example.testing.with;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceTesting {
    PaymentStrategyFactoryTesting paymentStrategyFactoryTesting;
    public PaymentServiceTesting(PaymentStrategyFactoryTesting paymentStrategyFactoryTesting) {
        this.paymentStrategyFactoryTesting = paymentStrategyFactoryTesting;
    }

    String processPayment(PaymentDTOTesting paymentDTOTesting) {
       PaymentStrategyTesting strategyTesting = paymentStrategyFactoryTesting.getPaymentStrategyTesting(paymentDTOTesting.getType());
       if(strategyTesting == null) {
           return "Wrong payment strategy";
       }
       return strategyTesting.pay(paymentDTOTesting.getAmount());
    }
}
