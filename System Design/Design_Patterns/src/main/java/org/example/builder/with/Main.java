package org.example.builder.with;

public class Main {
    public static void main(String[] args) {
        LoanApplication loan =
                new LoanApplication.Builder()
                        .customerName("Arun")
                        .loanAmount(4000000)
                        .tenure(180)
                        .interestRate(7.5)
                        .loanType("HOME_LOAN")
                        .employmentType("SALARIED")
                        .monthlyIncome(160000)
                        .build();

        //Or

        LoanApplication.Builder loanBuilder = new LoanApplication.Builder();

        loanBuilder.customerName("Arun");
        loanBuilder.loanAmount(4000000);
        loanBuilder.tenure(180);
        loanBuilder.loanType("HOME_LOAN");
        loanBuilder.interestRate(7.5);
        loanBuilder.loanType("HOME_LOAN");
        loanBuilder.employmentType("SALARIED");
        loanBuilder.monthlyIncome(160000);

        LoanApplication loan2 = loanBuilder.build();
    }
}
