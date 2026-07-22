package model;

import enums.TicketStatus;

import java.time.LocalDateTime;

public class ParkingTicket {

    private String ticketId;

    private Vehicle vehicle;

    private ParkingSpot parkingSpot;

    private LocalDateTime entryTime;

    private TicketStatus status;

    public ParkingTicket(String ticketId,
                         Vehicle vehicle,
                         ParkingSpot parkingSpot) {

        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = LocalDateTime.now();
        this.status = TicketStatus.ACTIVE;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

}
