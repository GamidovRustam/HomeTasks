package module04.task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShapesTest {

    @Test
    public void countTriangleAreaTest(){
        assertTrue(7.5 == Shapes.countTriangleArea(3.0, 5.0));
    }

    @Test
    public void countRectangleAreaTest(){
        assertTrue(25 == Shapes.countRectangleArea(5.0, 5.0));
    }

    @Test
    public void countCircleAreaTest(){
        assertEquals(314, Shapes.countCircleArea(10), 1);
    }

}
