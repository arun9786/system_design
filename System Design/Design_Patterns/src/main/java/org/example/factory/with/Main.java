package org.example.factory.with;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Vehiclefactory vehiclefactory = new Vehiclefactory();

        Vehicle car = vehiclefactory.getVehicle("Car");
        car.drive();

        Vehicle bike = vehiclefactory.getVehicle("Bike");
        bike.drive();

    }
}
