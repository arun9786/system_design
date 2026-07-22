package org.example.observer.with;

public class Main {
    public static void main(String[] args) {
        LoanService loanService = new LoanService();

        LoanObserver email =
                new EmailNotification();

        LoanObserver sms =
                new SmsNotification();

        LoanObserver push =
                new PushNotification();

        loanService.addObserver(email);
        loanService.addObserver(sms);
        loanService.addObserver(push);

        loanService.approveLoan("Arun");

        loanService.removeObserver(email);

        loanService.approveLoan("Chandru");

    }
}
