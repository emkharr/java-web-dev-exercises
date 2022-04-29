package exercises.technology.test;

import exercises.technology.main.Computer;
import exercises.technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LaptopTest {
    Laptop myLaptop;

    @Before
    public void beforeTests(){
        myLaptop = new Laptop("mac", 13, 500, true);
    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals("mac", this.myLaptop.getBrand());
        assertEquals(13, this.myLaptop.getScreenSize());
        assertEquals(500, this.myLaptop.getGbOfStorage());
        assertTrue(this.myLaptop.getMac());
    }


    @Test
    public void basicMathFunctionWorks(){
        assertEquals(4, this.myLaptop.basicMath());
    }

    @Test
    public void macReturnsFalse(){
        assertFalse(this.myLaptop.whoops());
    }
}
