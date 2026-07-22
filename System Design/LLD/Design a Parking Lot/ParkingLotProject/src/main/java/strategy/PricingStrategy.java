package strategy;

import model.ParkingTicket;

public interface PricingStrategy {

    double calculate(
            ParkingTicket ticket);

}
