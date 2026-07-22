package model;

import enums.SpotType;

public abstract class ParkingSpot {

    protected int spotId;

    protected SpotType spotType;

    protected boolean occupied;

    protected Vehicle vehicle;

    public boolean isOccupied() {
        return occupied;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public void occupy(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.occupied = true;
    }

    public void release() {
        this.vehicle = null;
        this.occupied = false;
    }
}
