package org.example.singleresponsibality.correctcode;

class UserRepository {

    public void saveUser(String name, String email) {
        System.out.println("Saving user to database");
    }
}
