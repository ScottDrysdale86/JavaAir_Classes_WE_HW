import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    
    Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("Bob Dylan",2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Bob Dylan", this.passenger.getName());
    }

    @Test
    public void passengerHasNumberOfBags(){
        assertEquals(2, this.passenger.getNumOfBags());
    }
}
