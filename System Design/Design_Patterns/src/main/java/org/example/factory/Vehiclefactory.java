package org.example.factory;

public class Vehiclefactory {
    public Vehicle getVehicle(String type) {

        if(type==null){
            return null;
        }

        if(type.equalsIgnoreCase("Bike")){
            return new Bike();
        } else if(type.equalsIgnoreCase("Car")){
            return new Car();
        }

        return null;
    }
}
