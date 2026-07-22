package org.unit.testing.junit.service;

import org.springframework.stereotype.Service;

@Service
public class LoanEligibilityService {

    public boolean isEligible(
            double salary,
            int creditScore) {

        return salary >= 50000
                && creditScore >= 700;
    }

    public String getRiskCategory(
            int creditScore) {

        if (creditScore >= 750) {
            return "LOW_RISK";
        }

        if (creditScore >= 650) {
            return "MEDIUM_RISK";
        }

        return null;
    }
}
