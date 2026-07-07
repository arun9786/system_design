package org.example.factory.without;

class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving Truck");
    }
}
