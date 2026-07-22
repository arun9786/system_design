package model;

import enums.SpotType;

public class CompactSpot extends ParkingSpot {

    public CompactSpot(int id) {

        this.spotId = id;
        this.spotType = SpotType.COMPACT;
    }

}
