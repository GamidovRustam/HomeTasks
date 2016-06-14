package module06.task1;

import module06.task1.chekInput.CheckInput;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import static module05.ArraysMethods.*;

public class Mod05WithExeptions {
public static void main(String[] args){


    Scanner sc = new Scanner(System.in);
    CheckInput checkInput = new CheckInput();

    System.out.println("Now you can set array's lenght:");
    try {
        int lenght = checkInput.ifBiggerThanZeroInt();
        int[] intArr = new int[lenght];

    System.out.println("Array is filled with a random values:\n" + Arrays.toString(setRandomValues(intArr)) + "\n");

    System.out.println("maximal value = " + findMaxValue(intArr));
    System.out.println("minimal value = " + findMinValue(intArr) + "\n");

    System.out.println("Array is sorted by using \"Bubble\" algorithm:\n" +
                        Arrays.toString(sortBubble(intArr.clone())) + "\n");

    System.out.println("Array is sorted by using \"Selection\" algorithm:" + "\n" +
                        Arrays.toString(sortSelection(intArr.clone())));
    } catch (InputMismatchException e){
        System.out.println("ERROR: Please,restart program and enter just numbers in format #:");
    }
}
}
