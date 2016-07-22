package module04.task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperaturesTest {

    @Test
    public void convertCtoFTest(){
        assertEquals(50, Temperatures.convertCtoF(10), 1);
    }

    @Test
    public void convertFtoCTest(){
        assertEquals(-12.2, Temperatures.convertFtoC(10), 0.1);
    }
}
