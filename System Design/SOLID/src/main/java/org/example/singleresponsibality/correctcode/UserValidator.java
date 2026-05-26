package org.example.singleresponsibality.correctcode;

class UserValidator {

    public boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
}
