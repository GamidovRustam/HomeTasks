package module06.task1.chekInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckInput extends Exception{

    public static double ifBiggerThanZeroDouble() {
        double userInput = 0;
        boolean lessThanZero = true;

            while (lessThanZero) {
                    userInput = ifDouble();
                if (userInput <= 0) {
                    System.out.println("Wrong! Please, enter the number bigger than zero:");
                } else {
                    lessThanZero = false;
                }
            }
        return userInput;
    }

    public static int ifBiggerThanZeroInt() {
        int userInput = 0;
        boolean lessThanZero = true;

        while (lessThanZero) {
            userInput = ifInt();
            if (userInput <= 0) {
                System.out.println("Wrong! Please, enter the number bigger than zero:");
            } else {
                lessThanZero = false;
            }
        }
        return userInput;
            }

    public static int ifNegativeValueInt() {
        int userInput = 0;
        boolean lessThanZero = true;

        while (lessThanZero) {
                userInput = ifInt();
            if (userInput < 0) {
                System.out.println("Wrong! Please, enter the number bigger than zero:");
            } else {
                lessThanZero = false;
            }
        }
        return userInput;
    }


    public static double ifDouble() throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static int ifInt() throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        int i;
        try {
            i = sc.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Wrong! Please, enter the number:");
            i = ifInt();
        }
        return i;
    }

    }




