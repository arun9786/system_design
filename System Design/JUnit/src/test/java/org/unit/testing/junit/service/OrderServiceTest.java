package org.unit.testing.junit.service;

import org.junit.jupiter.api.Test;
import org.unit.testing.junit.dto.Order;

import static org.junit.jupiter.api.Assertions.*;
public class OrderServiceTest {

    @Test
    public void verifyOrder() {
        OrderService orderService = new OrderService();

        Order order = orderService.getOrder();

        assertAll(
                "Order Validation",
                ()->assertEquals(101L, order.getId()),
                ()->assertEquals("Laptop", order.getProductName()),
                ()->assertEquals(75000, order.getAmount()),
                ()->assertEquals("CONFIRMED", order.getStatus())
        );
    }
}
