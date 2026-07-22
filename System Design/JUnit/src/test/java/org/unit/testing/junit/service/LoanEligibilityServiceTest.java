package org.unit.testing.junit.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoanEligibilityServiceTest {

    private final LoanEligibilityService loanEligibilityService = new LoanEligibilityService();

    @Test
    public void checkEligibleForSalary60000AndCreditScore750() {
        double salary = 60000;
        int creditScore = 750;

        boolean eligible = loanEligibilityService.isEligible(salary, creditScore);
        assertTrue(eligible);
    }

    @Test
    public void checkNotEligibleForSalary40000AndCreditScore750() {
        double salary = 40000;
        int creditScore = 750;

        boolean eligible = loanEligibilityService.isEligible(salary, creditScore);
        assertFalse(eligible);
    }

    @Test
    public void checkNotEligibleForSalary60000AndCreditScore650() {
        double salary = 60000;
        int creditScore = 650;

        boolean eligible = loanEligibilityService.isEligible(salary, creditScore);
        assertFalse(eligible);
    }

    @Test
    public void checkRiskCategoryForCreditScore800() {
        int creditScore = 800;

        String riskCategory = loanEligibilityService.getRiskCategory(creditScore);

        assertEquals("LOW_RISK", riskCategory);
    }

    @Test
    public void checkRiskCategoryForCreditScore500() {
        int creditScore = 500;

        String riskCategory = loanEligibilityService.getRiskCategory(creditScore);

       assertNull(riskCategory);
    }


}
