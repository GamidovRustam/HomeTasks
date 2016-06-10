package Module04;

import Module04.Task1.CounterOfShapesArea;
import Module04.Task2.TemperatureConverter;
import Module04.Task3.DistanceCalculator;

import java.util.Scanner;

public class StarterWithExeptions {
    public static void main(String[] args) {
        String error = "not correct! Please,restart program and enter the number in format # or #,#:";

        Scanner sc = new Scanner(System.in);
        CounterOfShapesArea countArea = new CounterOfShapesArea();
        System.out.println("Let's calculate some shapes area, and we begin with triangle.");
        System.out.println("Enter the hight of triangle:");

//        final double userInput = sc.nextDouble();

        try {
//            final double age = Double.parseDouble(userInput);


//            System.out.println(age);
            countArea.setTriangleHight(sc.nextDouble());
        } catch (NumberFormatException ex){
            System.out.println("nonono ");
        }
            System.out.println("now enter the lenght of the base:");
            countArea.setTriangleBase(sc.nextDouble());
            System.out.println("Triangle area = " +
                    countArea.countTriangleArea(countArea.getTriangleHight(), countArea.getTriangleBase())
                    + " square meters");
            System.out.println("");


            System.out.println("Well done! Now let's calculate the rectangle area.");
            System.out.println("enter sideA lenght:");
            countArea.setRectSideA(sc.nextDouble());
            System.out.println("and sideB:");
            countArea.setRectSideB(sc.nextDouble());
            System.out.println("Rectangle area = " +
                    countArea.countRectangleArea(countArea.getRectSideA(), countArea.getRectSideB()) +
                    " square meters");
            System.out.println("");
            System.out.println("And the last shape is a circle:");
            System.out.println("enter the radius of a circle:");

            countArea.setRadius(sc.nextDouble());
            System.out.println("Circle area = " + countArea.countCircleArea(countArea.getRadius()) + " square meters");
            System.out.println("");


            TemperatureConverter temperature = new TemperatureConverter();
            System.out.println("Now, you can convert the temperature grades.");
            System.out.println("enter the Celsius grades:");

            temperature.setCelsius(sc.nextDouble());
            System.out.println("in Fahrenheit it will be " + temperature.convertCtoF(temperature.getCelsius()));
            System.out.println("and Fahrenheit to Celsius (enter grades):");

            temperature.setFahrenheit(sc.nextDouble());
            System.out.println("in Celsius it will be " + temperature.convertFtoC(temperature.getFahrenheit()));
            System.out.println("");


            DistanceCalculator distance = new DistanceCalculator();
            System.out.println("Ok! Now you can calculate the distance between 2 points");
            System.out.println("Enter point A coordinate X");
            //очень много одинаковых кусков кода. Подумай, как это можно оптимизировать
            distance.setPointAX(sc.nextDouble());
            System.out.println("Enter point A coordinate Y");
            distance.setPointAY(sc.nextDouble());
            System.out.println("Enter point B coordinate X");
            distance.setPointBX(sc.nextDouble());
            System.out.println("Enter point B coordinate Y");
            distance.setPointBY(sc.nextDouble());
            System.out.println("The distance between point's A and B = "
                    + distance.countDistance(distance.getPointAX(),
                    distance.getPointAY(),
                    distance.getPointBX(),
                    distance.getPointBY()) +
                    " meters.");

        System.out.println("That's all! Bye!");

    }
}
