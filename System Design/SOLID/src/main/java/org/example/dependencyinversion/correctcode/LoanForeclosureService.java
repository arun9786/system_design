package org.example.dependencyinversion.correctcode;

class LoanForeclosureService {

    private NotificationService notificationService;

    public LoanForeclosureService(
            NotificationService notificationService) {

        this.notificationService =
                notificationService;
    }

    public void forecloseLoan(String loanId) {

        System.out.println(
                "Loan foreclosed successfully: " + loanId
        );

        notificationService.send(
                "Your loan is foreclosed"
        );
    }
}
