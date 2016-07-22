package module04.task3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistancesTest {

    @Test
    public void countDistanceTest(){
        assertEquals(1, Distances.countDistance(1, 1, 1, 2), 0);
    }

}
