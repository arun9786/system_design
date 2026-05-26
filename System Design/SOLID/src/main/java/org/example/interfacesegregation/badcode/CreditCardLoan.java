package org.example.interfacesegregation.badcode;

public class CreditCardLoan implements LoanPayment {

    @Override
    public void doPayment(int amount) {
        System.out.println("Credit Card Loan payment");
    }

    @Override
    public void foreCloseLoan() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
