package org.example.factory.without;

public class Main {

    public static void main(String[] args) {

        String vehicleType = "CAR";

        Vehicle vehicle;

        //CLinet knows the object
        if (vehicleType.equals("CAR")) {
            vehicle = new Car();

        } else if (vehicleType.equals("BIKE")) {
            vehicle = new Bike();

        } else if (vehicleType.equals("TRUCK")) {
            vehicle = new Truck();

        } else {
            throw new IllegalArgumentException("Invalid vehicle type");
        }

        vehicle.drive();
    }
}