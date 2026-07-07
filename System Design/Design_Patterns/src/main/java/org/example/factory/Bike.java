package org.example.factory;

public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving on Bike");
    }
}
