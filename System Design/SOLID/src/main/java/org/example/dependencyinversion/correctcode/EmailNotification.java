package org.example.dependencyinversion.correctcode;

class EmailNotification
        implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println(
                "Email Sent: " + message
        );
    }
}
