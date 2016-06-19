package module05;

import java.util.Arrays;

import static module05.MyArrays.*;
import static module06.task1.userInput.UserInput.*;

class RunnerWithExeption {
    public static void main(String[] args){
        System.out.println("Now you can set array's lenght:");
        int length = inputBiggerThanZeroInt();
        int[] intArr = new int[length];

        System.out.println("Array is filled with a random values:\n" + Arrays.toString(setRandomValues(intArr)) + "\n");

        System.out.println("maximal value = " + findMaxValue(intArr));
        System.out.println("minimal value = " + findMinValue(intArr) + "\n");

        System.out.println("Array is sorted by using \"Bubble\" algorithm:\n" +
                            Arrays.toString(sortBubble(intArr.clone())) + "\n");

        System.out.println("Array is sorted by using \"Selection\" algorithm:" + "\n" +
                            Arrays.toString(sortSelection(intArr.clone())));
    }
}
