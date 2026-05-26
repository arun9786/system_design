package org.example.dependencyinversion.badcode;

class EmailNotification {

    public void send(String message) {
        System.out.println("Email Sent: " + message);
    }
}
