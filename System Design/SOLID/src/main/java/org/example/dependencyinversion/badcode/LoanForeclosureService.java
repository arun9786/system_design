package org.example.dependencyinversion.badcode;

class LoanForeclosureService {

    private EmailNotification emailNotification =
            new EmailNotification();

    public void forecloseLoan(String loanId) {

        System.out.println(
                "Loan foreclosed successfully: " + loanId
        );

        emailNotification.send(
                "Your loan is foreclosed"
        );
    }
}
