import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    
    Flight flight;
    Pilot pilot;
    Pilot pilot2;
    CabinCrewMember cabinCrewMember;
    CabinCrewMember cabinCrewMember2;

    Passenger passenger;
    Passenger passenger2;
    Passenger passenger3;

    Plane plane;


    @Before
    public void setUp(){
        pilot = new Pilot("Steve Jones", Rank.CAPTAIN,"123B");
        pilot2 = new Pilot("Robin Williams", Rank.FIRSTOFFICER,"321A");
        cabinCrewMember = new CabinCrewMember("Jenny Bond", Rank.FLIGHTATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Alex Smith", Rank.FLIGHTATTENDANT);
        plane = new Plane(PlaneType.AIRBUS350);
        flight = new Flight(plane,"SHE234","EDI","LHR", LocalTime.parse("13:00"));
        flight.addToPilots(pilot);
        flight.addToPilots(pilot2);
        flight.addToCabinCrew(cabinCrewMember);
        flight.addToCabinCrew(cabinCrewMember2);

        passenger = new Passenger("Robert Smith", 1);
        passenger2 = new Passenger("James Bond", 5);
        passenger3 = new Passenger("James Blonde", 1);



    }

    @Test
    public void hasPilots(){
        assertEquals(2, this.flight.getPilotNumber());
    }

    @Test
    public void hasCrew(){
        assertEquals(2, this.flight.getCabinCrewNumber());
    }

    @Test
    public void hasNoPassengers(){
        assertEquals(0, this.flight.getPassengersNumber());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("SHE234", this.flight.getFlightNumber());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("LHR", this.flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals(LocalTime.parse("13:00"), this.flight.getDepartureTime());
    }

    @Test
    public void hasDestination() {
        assertEquals("EDI", this.flight.getDestination());
    }

    @Test
    public void canAddPassenger(){
        flight.addToPassengers(passenger);
        flight.addToPassengers(passenger);

        assertEquals(1, this.flight.getPassengersNumber());
        assertEquals("EDI", this.passenger.getPassengerFlightDetails().get("Destination"));
    }

    @Test
    public void cantAddPassengerIfNoSeatsFree(){
        assertEquals("Flight Fully Booked", this.flight.addToPassengers(passenger));
    }

    @Test
    public void canGetNumberOfAvailableSeats(){
        flight.addToPassengers(passenger);
        assertEquals(349, this.flight.getAvailableSeats());
    }

    @Test
    public void canGetPlaneTotalWeight(){
        assertEquals(14000, this.flight.getPlaneTotalWeight(),0.0);
    }

    @Test
    public void canGetTotalBagsBooked() {
        flight.addToPassengers(passenger);
        flight.addToPassengers(passenger2);

        assertEquals(6, this.flight.getTotalBagsBooked(),0.0);
    }

    @Test
    public void hasFlightDetailsPlaneName(){
        flight.returnFlightHashmap();
        assertEquals(PlaneType.AIRBUS350.name(), this.flight.getPlaneNameDetails());
    }

    @Test
    public void hasFlightDetailsDestination(){
        flight.returnFlightHashmap();
        assertEquals("EDI", this.flight.getDestinationDetails());
    }

    @Test
    public void canGetSeatNumber(){
        flight.addToPassengers(passenger);
        flight.addToPassengers(passenger2);
        flight.addToPassengers(passenger3);

        assertEquals(1, this.passenger.getSeatNumber());
        assertEquals(2, this.passenger2.getSeatNumber());
        assertEquals(3, this.passenger3.getSeatNumber());



//        flight.getSeatNumber();
    }
}
