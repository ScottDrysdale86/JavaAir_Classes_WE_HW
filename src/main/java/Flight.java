import java.util.ArrayList;

public class Flight {
    private final ArrayList<Pilot> pilots;
    private final ArrayList<CabinCrewMember> cabinCrew;
    private final ArrayList<Passenger> passengers;
    private final Plane plane;
    private final String flightNumber;
    private final String destination;
    private final String departureAirport;
    private final String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<>();
        this.cabinCrew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int getPilotNumber() {
        return this.pilots.size();
    }

    public int getCabinCrewNumber() {
        return this.cabinCrew.size();
    }

    public int getPassengersNumber() {
        return this.passengers.size();
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public void addToPilots(Pilot pilot){
        this.pilots.add(pilot);
    }

    public String addToPassengers(Passenger passenger){
        if( this.getAvailableSeats() >0) {
            this.passengers.add(passenger);
        }
        return "Flight Fully Booked";
    }

    public void addToCabinCrew(CabinCrewMember cabinCrewMember){
        this.cabinCrew.add(cabinCrewMember);
    }

    public int getAvailableSeats() {
        return this.plane.getPlaneCapacity() - this.getPassengersNumber();
    }

    public double getPlaneTotalWeight(){
        return this.plane.getPlaneWeight();
    }

    public double getTotalBagsBooked(){
        int bags = 0;
        for (Passenger passenger: this.passengers) {
           bags += passenger.getNumOfBags();
        }
        return bags;
    }
}
