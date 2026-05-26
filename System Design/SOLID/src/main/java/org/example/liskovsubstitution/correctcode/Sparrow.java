package org.example.liskovsubstitution.correctcode;

class Sparrow extends Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }
}
