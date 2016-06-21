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



// lines 29, 45, 61, 77, 96, 113 - "magic numbers"
// How to avoid them:
//      1) uncomment lines 6-20, 30, 46, 62, 78, 97, 114
//      2) delete lines 29, 45, 61, 77, 96, 113

//inputPositiveOrZeroInt - похоже, что мы вводим какое-то число и сохраняем его куда-то (в поле, например), но ничего не возвращаем

//inputInt(), inputDouble() - ты создаешь неогранниченное количество обьектов Сканнер. Вынеси эту строку из цикла
