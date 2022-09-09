import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    
    Flight flight;
    Pilot pilot;
    Pilot pilot2;
    CabinCrewMember cabinCrewMember;
    CabinCrewMember cabinCrewMember2;

    Passenger passenger;

    Plane plane;


    @Before
    public void setUp(){
        pilot = new Pilot("Steve Jones", Rank.CAPTAIN,"123B");
        pilot2 = new Pilot("Robin Williams", Rank.FIRSTOFFICER,"321A");
        cabinCrewMember = new CabinCrewMember("Jenny Bond", Rank.FLIGHTATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Alex Smith", Rank.FLIGHTATTENDANT);
        plane = new Plane(PlaneType.AIRBUS350);
        flight = new Flight(plane,"SHE234","EDI","LHR","13:00");
        flight.addToPilots(pilot);
        flight.addToPilots(pilot2);
        flight.addToCabinCrew(cabinCrewMember);
        flight.addToCabinCrew(cabinCrewMember2);

        passenger = new Passenger("Robert Smith", 1);

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
        assertEquals("13:00", this.flight.getDepartureTime());
    }

    @Test
    public void hasDestination() {
        assertEquals("EDI", this.flight.getDestination());
    }

    @Test
    public void canAddPassenger(){
        flight.addToPassengers(passenger);
        assertEquals(1, this.flight.getPassengersNumber());
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




}
