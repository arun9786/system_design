package org.example.interfacesegregation.correctcode;

public class CreditCardLoan implements LoanPayment {

    @Override
    public void doPayment(int amount) {
        System.out.println("Credit Card Loan payment");
    }
}
