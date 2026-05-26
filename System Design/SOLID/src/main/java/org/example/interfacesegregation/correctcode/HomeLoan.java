package org.example.interfacesegregation.correctcode;

public class HomeLoan implements SecureLoan {

    @Override
    public void doPayment(int amount) {
        System.out.println("Home Loan payment done");
    }

    @Override
    public void foreCloseLoan() {
        System.out.println("Home Loan closed");
    }
}
