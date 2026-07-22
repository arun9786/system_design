package org.unit.testing.junit.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryServiceTest {

    private final SalaryService salaryService = new SalaryService();

    @Test
    public void shouldExpectedBonus24000ForSalary120000() {
        double salary = 120000;

        double bonus = salaryService.calculateBonus(salary);

        assertEquals(24000, bonus);
    }

    @Test
    public void shouldExpectedBonus7500ForSalary75000() {
        double salary = 75000;

        double bonus = salaryService.calculateBonus(salary);

        assertEquals(7500, bonus);
    }

    @Test
    public void shouldExpectedBonus0ForSalary30000() {
        double salary = 30000;

        double bonus = salaryService.calculateBonus(salary);

        assertEquals(0, bonus);
    }

    @Test
    public void shouldExpectedBonus5000ForSalary50000() {
        double salary = 50000;

        double bonus = salaryService.calculateBonus(salary);

        assertEquals(5000, bonus);
    }
}
