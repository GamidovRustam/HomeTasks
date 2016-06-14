package module06.task1;

import Module04.Task1.CounterOfShapesArea;
import Module04.Task2.TemperatureConverter;
import Module04.Task3.DistanceCalculator;
import module06.task1.chekInput.CheckInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mod04WithExeptions {
    private static String error = "ERROR: Please,restart program and enter just numbers in format # or #,#:";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CounterOfShapesArea countArea = new CounterOfShapesArea();
        CheckInput checkInput = new CheckInput();
        System.out.println("Let's calculate some shapes area, and we begin with triangle." + "\n"
                            + "Enter the hight of triangle:");

        try {
            double userInput = checkInput.ifBiggerThanZeroDouble();
            countArea.setTriangleHight(userInput);
            }catch(InputMismatchException ex){
                System.out.println(error);
                return;
            }
            System.out.println("now enter the lenght of the base:");

        try {
            double userInput = checkInput.ifBiggerThanZeroDouble();
            countArea.setTriangleBase(userInput);
            } catch (InputMismatchException ex){
            System.out.println(error);
            return;
            }

            System.out.println("Triangle area = " +
                    countArea.countTriangleArea(countArea.getTriangleHight(), countArea.getTriangleBase())
                    + " square meters" + "\n");

            System.out.println("Well done! Now let's calculate the rectangle area." + "\n" + "enter sideA lenght:");

        try {
            double userInput = checkInput.ifBiggerThanZeroDouble();
            countArea.setRectSideA(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }

            System.out.println("and sideB:");

        try {
            double userInput = checkInput.ifBiggerThanZeroDouble();
            countArea.setRectSideB(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }

            System.out.println("Rectangle area = " +
                    countArea.countRectangleArea(countArea.getRectSideA(), countArea.getRectSideB()) +
                    " square meters" + "\n");
            System.out.println("And the last shape is a circle:" + "\n" + "enter the radius of a circle:");

        try {
            double userInput = checkInput.ifBiggerThanZeroDouble();
            countArea.setRadius(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }

            System.out.println("Circle area = " + countArea.countCircleArea(countArea.getRadius())
                                + " square meters" + "\n");

            TemperatureConverter temperature = new TemperatureConverter();
            System.out.println("Now, you can convert the temperature grades." + "\n" + "enter the Celsius grades:");

        try {
            final double userInput = sc.nextDouble();
            temperature.setCelsius(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }

            System.out.println("in Fahrenheit it will be " + temperature.convertCtoF(temperature.getCelsius()));
            System.out.println("and Fahrenheit to Celsius (enter grades):");

        try {
            final double userInput = sc.nextDouble();
            temperature.setFahrenheit(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }
            System.out.println("in Celsius it will be " + temperature.convertFtoC(temperature.getFahrenheit()) + "\n");

            DistanceCalculator distance = new DistanceCalculator();
            System.out.println("Ok! Now you can calculate the distance between 2 points" + "\n"
                                + "Enter point A coordinate X");

        try {
            double userInput = checkInput.ifBiggerThanZeroDouble();
            distance.setPointAX(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }

        System.out.println("Enter point A coordinate Y");

        try {
            double userInput = checkInput.ifBiggerThanZeroDouble();
            distance.setPointAY(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }

        System.out.println("Enter point B coordinate X");

        try {
            double userInput = checkInput.ifBiggerThanZeroDouble();
            distance.setPointBX(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }

        System.out.println("Enter point B coordinate Y");

        try {
            double userInput = checkInput.ifBiggerThanZeroDouble();
            distance.setPointBY(userInput);
        } catch (InputMismatchException ex){
            System.out.println(error);
            return;
        }

            System.out.println("The distance between point's A and B = "
                    + distance.countDistance(distance.getPointAX(),
                    distance.getPointAY(),
                    distance.getPointBX(),
                    distance.getPointBY()) + " meters.");

            System.out.println("That's all! Bye!");
    }
}
