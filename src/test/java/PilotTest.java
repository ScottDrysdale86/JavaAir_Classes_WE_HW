import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    
    Pilot pilot;

    @Before
    public void setUp(){
        pilot = new Pilot("Capt Sparrow", Rank.CAPTAIN, "123B");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Capt Sparrow", this.pilot.getName());
    }

    @Test
    public void canChangepilotName(){
        this.pilot.setPilotName("Dave Grohl");
        assertEquals("Dave Grohl", this.pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, this.pilot.getRank());
    }

    @Test
    public void hasLicenseNumber() {
        assertEquals("123B", this.pilot.getLicenseNumber());
    }

    @Test
    public void canChangepilotLicenseNumber(){
        this.pilot.setLicenseNumber("1234B");
        assertEquals("1234B", this.pilot.getLicenseNumber());
    }

    @Test
    public void hasFlyMessage() {
        assertEquals("I am flying the plane", this.pilot.flyPlane());
    }
}
