package module06.task1;

import java.util.Arrays;
import java.util.InputMismatchException;

import static module05.MyArrays.*;
import static module06.task1.userInput.UserInput.*;

class Mod05WithExeptions {
    public static void main(String[] args) {

        System.out.println("Now you can set array's lenght:");
        try {
            int length = inputBiggerThanZeroInt();
            int[] intArr = new int[length];

            System.out.println("Array is filled with a random values:\n" + Arrays.toString(setRandomValues(intArr)) + "\n");

            System.out.println("maximal value = " + findMaxValue(intArr));
            System.out.println("minimal value = " + findMinValue(intArr) + "\n");

            System.out.println("Array is sorted by using \"Bubble\" algorithm:\n" +
                    Arrays.toString(sortBubble(intArr.clone())) + "\n");

            System.out.println("Array is sorted by using \"Selection\" algorithm:" + "\n" +
                    Arrays.toString(sortSelection(intArr.clone())));
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Please,restart program and enter just numbers in format #:");
        }
    }
}
