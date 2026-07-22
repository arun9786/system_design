package org.unit.testing.junit.service;

import org.springframework.stereotype.Service;
import org.unit.testing.junit.dto.Order;

@Service
public class OrderService {

    public Order getOrder() {
        return new Order(
                101L,
                "Laptop",
                75000,
                "CONFIRMED"
        );
    }
}
