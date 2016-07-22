package module05;

import org.junit.Test;

import static org.junit.Assert.*;


public class MyArraysTest {
    private int[] array = {3, 2, 15, 7, 9};
    private int[] sortedArray = {2, 3, 7, 9, 15};

    @Test
    public void setRandomValuesTest(){
        int length = 10;
        int[] array = new int[length];

        MyArrays.setRandomValues(array);

        for (int i: array) {
            assertNotNull(i);
        }
        assertTrue(length == array.length);
    }

    @Test
    public void findMaxValueTest(){
        int[] array = {3, 2, 15, 7, 9};

        assertEquals(15, MyArrays.findMaxValue(array));
    }

    @Test
    public void findMinValueTest(){


        assertEquals(2, MyArrays.findMinValue(array));
    }

    @Test
    public void sortBubbleTest(){
        assertArrayEquals(sortedArray, MyArrays.sortBubble(array));
    }

    @Test
    public void sortSelectionTest(){
        assertArrayEquals(sortedArray, MyArrays.sortSelection(array));
    }
}
