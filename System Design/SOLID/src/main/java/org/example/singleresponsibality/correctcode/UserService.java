package org.example.singleresponsibality.correctcode;

class UserService {

    private UserValidator validator = new UserValidator();
    private UserRepository repository = new UserRepository();
    private EmailService emailService = new EmailService();

    public void registerUser(String name, String email) {

        if (!validator.isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email");
        }

        repository.saveUser(name, email);
        emailService.sendWelcomeEmail(email);

        System.out.println("User registered successfully");
    }
}
