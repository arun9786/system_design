package org.example.observer.with;

public interface LoanObserver {
    void update(
            String customerName,
            String loanStatus
    );
}
