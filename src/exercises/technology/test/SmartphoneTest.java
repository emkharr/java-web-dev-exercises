package exercises.technology.test;

import exercises.technology.main.Laptop;
import exercises.technology.main.Smartphone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmartphoneTest {
    Smartphone myPhone;

    @Before
    public void beforeTests(){
        myPhone = new Smartphone("mac", 13, 500);
    }

    @Test
    public void constructorSetsValuesTest() {
        assertEquals("mac", this.myPhone.getBrand());
        assertEquals(13, this.myPhone.getScreenSize());
        assertEquals(500, this.myPhone.getGbOfStorage());
        assertFalse(this.myPhone.getScreenBroken());
    }


    @Test
    public void basicMathFunctionWorks(){
        assertEquals(4, this.myPhone.basicMath());
    }

}
