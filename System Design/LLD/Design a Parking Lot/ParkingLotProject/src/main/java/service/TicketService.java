package service;

import model.ParkingSpot;
import model.ParkingTicket;
import model.Vehicle;

import java.util.UUID;

public class TicketService {

    public ParkingTicket generateTicket(
            Vehicle vehicle,
            ParkingSpot spot) {

        return new ParkingTicket(
                UUID.randomUUID().toString(),
                vehicle,
                spot);

    }

}
