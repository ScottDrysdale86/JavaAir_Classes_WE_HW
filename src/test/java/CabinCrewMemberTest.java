import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    
    CabinCrewMember cabinCrewMember;

    @Before
    public void setUp(){
        cabinCrewMember = new CabinCrewMember("Jane White", Rank.FLIGHTATTENDANT);
    }

    @Test
    public void crewHasName(){
        assertEquals("Jane White", this.cabinCrewMember.getName());
    }

    @Test
    public void crewHasRank(){
        assertEquals(Rank.FLIGHTATTENDANT, this.cabinCrewMember.getRank());
    }

    @Test
    public void canChangeCrewName(){
        this.cabinCrewMember.setCrewName("John White");
        assertEquals("John White", this.cabinCrewMember.getName());
    }

    @Test
    public void canRelayMessage(){
        String message = this.cabinCrewMember.relayMessage("Fasten Seatbelts");
        assertEquals("Fasten Seatbelts", message);
    }
}
