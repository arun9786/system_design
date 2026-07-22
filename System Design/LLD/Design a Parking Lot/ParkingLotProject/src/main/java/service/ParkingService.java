package service;

import enums.PaymentStatus;
import enums.PaymentType;
import model.*;
import strategy.ParkingStrategy;

public class ParkingService {

    private ParkingStrategy parkingStrategy;

    private TicketService ticketService;

    private ParkingLot parkingLot;

    private PaymentService paymentService;

    public ParkingService(
            ParkingStrategy strategy,
            TicketService ticketService,
            ParkingLot parkingLot) {

        this.parkingStrategy = strategy;
        this.ticketService = ticketService;
        this.parkingLot = parkingLot;
    }

    public ParkingTicket parkVehicle(
            Vehicle vehicle) {

        ParkingSpot spot =
                parkingStrategy.findSpot(
                        vehicle,
                        parkingLot);

        if (spot == null) {

            throw new RuntimeException(
                    "Parking Full");

        }

        spot.occupy(vehicle);

        return ticketService.generateTicket(
                vehicle,
                spot);
    }

    public Payment exitVehicle (ParkingTicket ticket, PaymentType paymentType) {
        if(paymentType==null){
            throw new IllegalArgumentException("paymentType is null");
        }
        Payment payment = paymentService.pay(ticket,paymentType);
        if(payment==null || payment.getPaymentStatus()==PaymentStatus.FAILURE){
            throw new RuntimeException("payment is not completed");
        }

        ticket.getParkingSpot().release();

        return payment;
    }

}
