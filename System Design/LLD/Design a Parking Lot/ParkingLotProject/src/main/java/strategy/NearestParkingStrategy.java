package strategy;


import enums.SpotType;
import enums.VehicleType;
import model.ParkingFloor;
import model.ParkingLot;
import model.ParkingSpot;
import model.Vehicle;

public class NearestParkingStrategy
        implements ParkingStrategy {

    @Override
    public ParkingSpot findSpot(
            Vehicle vehicle,
            ParkingLot parkingLot) {

        for (ParkingFloor floor : parkingLot.getFloors()) {

            for (ParkingSpot spot :
                    floor.getParkingSpots()) {

                if (!spot.isOccupied()
                        && matches(vehicle, spot)) {

                    return spot;
                }

            }

        }

        return null;
    }

    private boolean matches(
            Vehicle vehicle,
            ParkingSpot spot) {

        if (vehicle.getVehicleType() == VehicleType.BIKE
                && spot.getSpotType() == SpotType.BIKE)
            return true;

        if (vehicle.getVehicleType() == VehicleType.CAR
                && spot.getSpotType() == SpotType.COMPACT)
            return true;

        if (vehicle.getVehicleType() == VehicleType.TRUCK
                && spot.getSpotType() == SpotType.LARGE)
            return true;

        return false;
    }

}