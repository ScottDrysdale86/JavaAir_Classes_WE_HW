import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Pilot pilot;
    Pilot pilot2;
    CabinCrewMember cabinCrewMember;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger;
    Passenger passenger2;
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
        passenger2 = new Passenger("James Bond", 5);
        flight.addToPassengers(passenger);
        flight.addToPassengers(passenger2);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void canReturnTotalReservedWeightForPassengersForAFlight(){
        assertEquals(7000, this.flightManager.calcBaggageReservedForTotalPassengers(),0.0);
    }

    @Test
    public void canCalcBaggageBookedByPassengers(){
        assertEquals(120.00, this.flightManager.calcBaggageBookedByPassengers(), 0.0);
    }


    @Test
    public void canCalcOverallWeightLeftForBaggage(){
        assertEquals(6880.00, this.flightManager.calcOverallWeightLeftForBaggage(), 0.0);
    }

}
