package otherTests.Mod5;

import java.util.Scanner;

public class ContrStatements {
//    public static final double PI = 3.14;

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the number:");

        final String command = sc.nextLine();

        switch (command){
            case "Start":
                System.out.println("Server is starting");
                break;
            case "Stop":
                System.out.println("Server is going to shutdown");
                break;
            default:
                System.out.println("Unknown comand: " + command);
        }






    }
}
