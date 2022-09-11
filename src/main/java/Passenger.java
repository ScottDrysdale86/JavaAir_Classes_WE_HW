import java.util.HashMap;

public class Passenger {

    private final String name;
    private final int numOfBags;
    private int seatNumber;
    private HashMap<String, Object> passengerFlightDetails;
    public Passenger(String name, int numOfBags) {
        this.name = name;
        this.numOfBags = numOfBags;
        this.passengerFlightDetails = new HashMap<>();
        this.seatNumber = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getNumOfBags() {
        return this.numOfBags;
    }

    public void setPassengerFlightDetails(HashMap<String, Object> passengerFlightDetails) {
        this.passengerFlightDetails = passengerFlightDetails;
    }

    public HashMap<String, Object> getPassengerFlightDetails() {
        return this.passengerFlightDetails;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }
}
