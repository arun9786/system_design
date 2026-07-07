package org.example.factory.with;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving on Car");
    }
}
