package org.example.liskovsubstitution.badcode;

class Penguin extends Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }

    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }

    public void swim() {
        System.out.println("Penguin swim");
    }
}
