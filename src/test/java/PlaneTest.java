import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    
    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void planeHasName(){
        assertEquals(PlaneType.BOEING737.name(), this.plane.getPlaneName());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(PlaneType.BOEING737.capacity, this.plane.getPlaneCapacity());
    }

    @Test
    public void planeHasTotalWeight(){
        assertEquals(PlaneType.BOEING737.totalWeight, this.plane.getPlaneWeight());
    }
}
