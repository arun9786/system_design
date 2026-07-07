package org.example.builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {

        Loan.LoanBuilder loan = new Loan.LoanBuilder()
                .customerName("Arun");

        loan.loanType("Personal");

        loan.build();

        System.out.println(loan);

    }
}
