package org.example.singleresponsibality.badcode;

class UserService {

    public void registerUser(String name, String email) {

        // Validation responsibility
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }

        // Database responsibility
        System.out.println("Saving user to database");

        // Email responsibility
        System.out.println("Sending welcome email");

        System.out.println("User registered successfully");
    }
}
