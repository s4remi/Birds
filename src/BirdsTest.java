import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class BirdsTest {
    private Birds birds;

    @org.junit.Test
    public void printBird() {
    }

    @org.junit.Test
    public void setNme() {
    }

    @org.junit.Test
    public void setExtint() {
    }

    @org.junit.Test
    public void setTypeName() {
    }

    @org.junit.Test
    public void setWingsNumber() {
    }

    @org.junit.Test
    public void setDescription() {
    }

    @org.junit.Test
    public void setCategory() {
    }

    @org.junit.Test
    public void getName() {
    }

    @org.junit.Test
    public void getWingsNumber() {
    }

    @org.junit.Test
    public void isExtint() {
    }

    @org.junit.Test
    public void getTypeName() {
    }

    @org.junit.Test
    public void getCategory() {
    }

    @org.junit.Test
    public void getDescription() {
    }

    @Before
    public void setUp() throws Exception{
        //FlightLess(String name,Category category,BirdsType typeName, boolean isExtint, int wingsNumber, String description,Food food
        birds = new FlightLess("flightless",Category.FLIGHTLESS ,BirdsType.KIWIS,false, 0, " they can't flight"+" \nthey are good birds",Food.BUDS);
    }
    @Test
    public void testNumberOfWings() {
        assertEquals(0, birds.getWingsNumber());
    }

x
}