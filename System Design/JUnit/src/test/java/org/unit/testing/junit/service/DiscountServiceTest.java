package org.unit.testing.junit.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountServiceTest {

    @ParameterizedTest
    @CsvSource({
            "1000,100",
            "2000,200",
            "5000,500",
            "500,0"
    })
    public void validateDiscount(int amount, double expected) {
        DiscountService discountService = new DiscountService();

        double actual = discountService.calculateDiscount(amount);

        assertEquals(expected, actual);
    }
}
