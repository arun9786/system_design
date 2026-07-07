package org.example.factory;

import java.util.logging.Logger;

public class FactoryMain {

    public static void main(String[] args) {
        Vehiclefactory vehiclefactory = new Vehiclefactory();

        Vehicle car = vehiclefactory.getVehicle("Car");
        car.drive();

        Vehicle bike = vehiclefactory.getVehicle("Bike");
        bike.drive();

        Logger logger = Logger.getLogger(FactoryMain.class.getName());
    }
}
