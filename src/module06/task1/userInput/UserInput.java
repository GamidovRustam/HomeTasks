package module06.task1.userInput;

import java.util.Scanner;

public class UserInput {
    private static final String ENTER_POSITIVE_NUMBER = "Wrong! Please, enter the number bigger than zero:";
    private static final String ENTER_DOUBLE_OR_NUMBER = "Wrong! Please, enter the number (# or #,#), that bigger than zero:";
    private static final String ENTER_NUMBER =  "Wrong! Please, enter the number:";
    private static Scanner sc = new Scanner(System.in);

    public static double inputPositiveDouble() {
        double userInput;

        while (true) {
            userInput = inputDouble();
            if (userInput <= 0) {
                System.out.println(ENTER_DOUBLE_OR_NUMBER);
            } else {
                break;
            }
        }
        return userInput;
    }

    public static int inputPositiveInt() {
        int userInput;

        while (true) {
            userInput = inputInt();
            if (userInput <= 0) {
                System.out.println(ENTER_POSITIVE_NUMBER);
            } else {
                break;
            }
        }
        return userInput;
    }

    public static double inputPositiveOrZeroDouble() {
        double userInput;

        while (true) {
            userInput = inputDouble();
            if (userInput < 0) {
                System.out.println(ENTER_POSITIVE_NUMBER);
            } else {
                break;
            }
        }
        return userInput;
    }

    public static int inputPositiveOrZeroInt() {
        int userInput;

        while (true) {
            userInput = inputInt();
            if (userInput < 0) {
                System.out.println(ENTER_POSITIVE_NUMBER);
            } else {
                break;
            }
        }
        return userInput;
    }

    public static double inputDouble() {
        double userInput;

        while (true) {
            if (sc.hasNextDouble()) {
                userInput = sc.nextDouble();
                break;
            } else {
              System.out.println(ENTER_NUMBER);
                sc.next();
            }
        }
        return userInput;
    }

    public static int inputInt(){
        int userInput;

        while (true) {
            if (sc.hasNextInt()) {
                userInput = sc.nextInt();
                break;
            } else {
                System.out.println(ENTER_NUMBER);
                sc.next();
            }
        }
        return userInput;
    }
}

//ENTER_DOUBLE_OR_NUMBER - смешно)) isNumber(double)? Может ENTER_DOUBLE_OR_INTEGER?

//inputPositiveOrZeroDouble() - метод нигде не используется

//Добавь еще метод close()  этот класс, а вызови его в конце метода мейн, напрмиер