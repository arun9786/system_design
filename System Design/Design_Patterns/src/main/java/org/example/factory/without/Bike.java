package org.example.factory.without;

class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding Bike");
    }
}
