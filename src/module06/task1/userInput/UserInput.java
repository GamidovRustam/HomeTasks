package module06.task1.userInput;

import java.util.Scanner;

public class UserInput {
//    private static String enterPositiveNumber = "Wrong! Please, enter the number bigger than zero:";
//    private static String enterDoubleOrNumber = "Wrong! Please, enter the number # or #,#:";
//    private static String enterNumber =  "Wrong! Please, enter the number:";
//
//    public static String getEnterPositiveNumber() {
//        return enterPositiveNumber;
//    }
//
//    public static String getEnterDoubleOrNumber() {
//        return enterDoubleOrNumber;
//    }
//
//    public static String getEnterNumber() {
//        return enterNumber;
//    }

    public static double inputBiggerThanZeroDouble() {
        double userInput = 0;
        boolean lessThanZero = true;

        while (lessThanZero) {
            userInput = inputDouble();
            if (userInput <= 0) {
                System.out.println("Wrong! Please, enter the number bigger than zero:");
                //System.out.println(getEnterPositiveNumber());
            } else {
                lessThanZero = false;
            }
        }
        return userInput;
    }

    public static int inputBiggerThanZeroInt() {
        int userInput = 0;
        boolean lessThanZero = true;

        while (lessThanZero) {
            userInput = inputInt();
            if (userInput <= 0) {
                System.out.println("Wrong! Please, enter the number bigger than zero:");
                //System.out.println(getEnterPositiveNumber());
            } else {
                lessThanZero = false;
            }
        }
        return userInput;
    }

    public static double inputPositiveOrZeroDouble() {
        double userInput = 0;
        boolean lessThanZero = true;

        while (lessThanZero) {
            userInput = inputDouble();
            if (userInput < 0) {
                System.out.println("Wrong! Please, enter the number bigger than zero:");
                //System.out.println(getEnterPositiveNumber());
            } else {
                lessThanZero = false;
            }
        }
        return userInput;
    }

    public static int inputPositiveOrZeroInt() {
        int userInput = 0;
        boolean lessThanZero = true;

        while (lessThanZero) {
            userInput = inputInt();
            if (userInput < 0) {
                System.out.println("Wrong! Please, enter the number bigger than zero:");
                //System.out.println(getEnterPositiveNumber());
            } else {
                lessThanZero = false;
            }
        }
        return userInput;
    }

    public static double inputDouble() {
        boolean ifNumber = false;
        double userInput = 0;

        while (!(ifNumber)) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextDouble()) {
                userInput = sc.nextDouble();
                ifNumber = true;
            } else {
                System.out.println("Wrong! Please, enter the number:");
//              System.out.println(getEnterNumber());
            }
        }
        return userInput;
    }

    public static int inputInt(){
        boolean ifNumber = false;
        int userInput = 0;

        while (!(ifNumber)) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                userInput = sc.nextInt();
                ifNumber = true;
            } else {
                    System.out.println("Wrong! Please, enter the number:");
//                //System.out.println(getEnterNumber());
            }
        }
        return userInput;
    }
}



// lines 29, 45, 61, 77, 96, 113 - "magic numbers"
// How to avoid them:
//      1) uncomment lines 6-20, 30, 46, 62, 78, 97, 114
//      2) delete lines 29, 45, 61, 77, 96, 113



