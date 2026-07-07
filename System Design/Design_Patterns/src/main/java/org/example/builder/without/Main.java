package org.example.builder.without;

public class Main {
    public static void main(String[] args) {
        LoanApplication loan1 = new LoanApplication(
                "Arun",
                4000000.0,
                7,       // mistake
                180,       // mistake
                "HOME_LOAN",
                "SALARIED",
                160000,
                null
        );
        //Need all details immediately

        //Or

        LoanApplication loan = new LoanApplication();

        loan.setCustomerName("Arun");
        loan.setLoanAmount(4000000);
        loan.setTenure(180);
        loan.setLoanType("HOME_LOAN");
        loan.setEmploymentType("SALARIED");
        loan.setMonthlyIncome(160000);

        //here loan is exist without loan interest rate
    }
}
