package org.example.interfacesegregation.badcode;

public class HomeLoan implements LoanPayment {

    @Override
    public void doPayment(int amount) {
        System.out.println("Home Loan payment done");
    }

    @Override
    public void foreCloseLoan() {
        System.out.println("Home Loan closed");
    }
}
