public class Passenger {

    private final String name;
    private final int numOfBags;

    public Passenger(String name, int numOfBags) {
        this.name = name;
        this.numOfBags = numOfBags;
    }

    public String getName() {
        return this.name;
    }

    public int getNumOfBags() {
        return this.numOfBags;
    }
}
