public class FlightManager {

    Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    //    calcBaggageWeightForPassengers - plane weight divided by 2
    public double calcBaggageReservedForTotalPassengers(){
        return this.flight.getPlaneTotalWeight() /2;
    }

//    calcBaggageBookedByPassengers - passenger bags * 20kg
    public double calcBaggageBookedByPassengers(){
        return this.flight.getTotalBagsBooked()*20.00;
    }

//    calcOverallWeightForBaggageLeft - plane baggage weight minus booked by passengers
    public double calcOverallWeightLeftForBaggage(){
        return calcBaggageReservedForTotalPassengers() - calcBaggageBookedByPassengers();
    }

}
