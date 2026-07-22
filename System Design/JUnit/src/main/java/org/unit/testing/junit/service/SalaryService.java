package org.unit.testing.junit.service;

import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    public double calculateBonus(double salary) {

        if (salary >= 100000) {
            return salary * 0.20;
        }

        if (salary >= 50000) {
            return salary * 0.10;
        }

        return 0;
    }
}
