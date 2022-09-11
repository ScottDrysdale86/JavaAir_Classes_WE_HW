import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Flight {
    private final ArrayList<Pilot> pilots;
    private final ArrayList<CabinCrewMember> cabinCrew;
    private final ArrayList<Passenger> passengers;
    private final Plane plane;
    private final String flightNumber;
    private final String destination;
    private final String departureAirport;
    private final LocalTime departureTime;
    public HashMap<String, Object> flightDetails;

    private int seatNumber;
    Random randNum = new Random();

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, LocalTime departureTime) {
        this.pilots = new ArrayList<>();
        this.cabinCrew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.flightDetails = new HashMap<>();
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

    public LocalTime getDepartureTime() {
        return this.departureTime;
    }

    public void addToPilots(Pilot pilot){
        this.pilots.add(pilot);
    }

    public HashMap returnFlightHashmap(){

        this.flightDetails.put("Plane", this.plane.getPlaneName());
        this.flightDetails.put("Flight Number", this.flightNumber);
        this.flightDetails.put("Destination", this.destination);
        this.flightDetails.put("Departure Airport", this.departureAirport);
        this.flightDetails.put("Departure Time", this.departureTime);
        return this.flightDetails;

    }

    public Object getPlaneNameDetails(){
        return this.flightDetails.get("Plane");
    }

    public Object getDestinationDetails(){
        return this.flightDetails.get("Destination");
    }

    public String addToPassengers(Passenger passenger){
        if( this.getAvailableSeats() >0 && !passengers.contains(passenger)) {
            this.passengers.add(passenger);
            passenger.setPassengerFlightDetails(this.returnFlightHashmap());
            passenger.setSeatNumber(this.getSeatNumber());
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

    public int getRandNum() {
//        int n = randNum.nextInt(this.plane.getPlaneCapacity()) + 1;
        int n = randNum.nextInt(2) + 1;

        return n;
    }

//    not tested or tried this
    public int getSeatNumber() {
        int seat = this.getRandNum();
//        System.out.println("random: " + seat);

            for (Passenger passenger : this.passengers) {
                System.out.println(" first rand: " + seat);
                System.out.println(("passenger seat: "+ passenger.getSeatNumber()));

//                if seat num is not 0, while rand == seat get new rand then set rand to seat.
                if(passenger.getSeatNumber() != 0){
                    while (passenger.getSeatNumber() == seat){
                        seat = this.getRandNum();
                        System.out.println("new rand: " + seat);


                    }
                    passenger.setSeatNumber(seat);
                }
            }


        System.out.println("final seat number: " + seat + "\n");
        return seat;
    }


}

