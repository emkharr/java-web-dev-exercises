package exercises.technology.test;

import exercises.technology.main.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {
    Computer myComputer;

    @Before
    public void beforeTests(){
        myComputer = new Computer("mac", 13, 500);
    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals("mac", this.myComputer.getBrand());
        assertEquals(13, this.myComputer.getScreenSize());
        assertEquals(500, this.myComputer.getGbOfStorage());
    }

    @Test
    public void basicMathFunctionWorks(){
        assertEquals(4, this.myComputer.basicMath());
    }
}
