package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void checkHeight(){
        visitor = new Visitor(20,200,10);
        assertTrue(rollerCoaster.isAllowedTo(visitor));
    }
    @Test
    public void hasReview(){
        assertEquals(10,rollerCoaster.getRating());
    }

    @Test
    public void doublePriceForGiants(){
        visitor = new Visitor(20,210,10);
        assertEquals(16.80, rollerCoaster.doublePriceFor(visitor), 0);
    }
}
