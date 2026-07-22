package org.example.testing.with;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class PaymentStrategyFactoryTesting {
    public final Map<String, PaymentStrategyTesting> paymentStrategies;

    public PaymentStrategyFactoryTesting(List<PaymentStrategyTesting> strategies) {
        paymentStrategies = strategies.stream().collect(Collectors.toMap(PaymentStrategyTesting::getType, Function.identity()));
    }

    public PaymentStrategyTesting getPaymentStrategyTesting(String type) {
        return paymentStrategies.get(type);
    }
}
