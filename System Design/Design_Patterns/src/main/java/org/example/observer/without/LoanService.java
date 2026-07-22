package org.example.observer.without;

public class LoanService {
    public final EmailNotification emailNotification;
    public final SmsNotification smsNotification;
    public final PushNotification pushNotification;
    public LoanService(EmailNotification emailNotification, SmsNotification smsNotification, PushNotification pushNotification) {
        this.emailNotification = emailNotification;
        this.smsNotification = smsNotification;
        this.pushNotification = pushNotification;
    }

    public void approveLoan(String customerName) {

        System.out.println(
                "Loan approved for: " + customerName
        );

        emailNotification.sendEmail(customerName,"APPROVED");
        smsNotification.sendSms(customerName,"APPROVED");
        pushNotification.sendPushNotification(customerName,"APPROVED");

        // if in future whatsapp msg is coming then again we need to modify this code also it was tightly coupled
    }
}
