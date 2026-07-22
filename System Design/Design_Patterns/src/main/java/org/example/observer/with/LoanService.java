package org.example.observer.with;

import java.util.ArrayList;
import java.util.List;

public class LoanService {
    private final List<LoanObserver> observers =
            new ArrayList<>();

    public void addObserver(LoanObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(LoanObserver observer) {
        observers.remove(observer);
    }

    public void approveLoan(
            String customerName) {

        System.out.println(
                "Loan approved for: "
                        + customerName
        );

        notifyObservers(
                customerName,
                "APPROVED"
        );
    }

    private void notifyObservers(
            String customerName,
            String loanStatus) {

        for (LoanObserver observer : observers) {

            observer.update(
                    customerName,
                    loanStatus
            );
        }
    }
}
