package org.example.strategy.with;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class PaymentStrategyFactory {

    private final Map<String, PaymentStrategy> strategyMap;

    public PaymentStrategyFactory(
            List<PaymentStrategy> strategies) {

        this.strategyMap =strategies
                .stream()
                .collect(Collectors.toMap(PaymentStrategy::getType, a->a));
    }

    public PaymentStrategy getStrategy(String type) {

        PaymentStrategy strategy =
                strategyMap.get(type);

        if (strategy == null) {
            throw new IllegalArgumentException(
                    "Unsupported payment type: " + type
            );
        }

        return strategy;
    }
}
