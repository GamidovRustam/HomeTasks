package module06.task1;


import java.util.InputMismatchException;

import static module04.task1.ShapesArea.*;
import static module04.task2.Temperatures.*;
import static module04.task3.Distance.*;
import static module06.task1.userInput.UserInput.*;

class Mod04WithExeptions {
    public static void main(String[] args) {

        System.out.println("Let's calculate some shapes area, and we begin with triangle." + "\n"
                + "Enter the hight of triangle:");
        try {
            setTriangleHight(inputBiggerThanZeroDouble());
            System.out.println("now enter the length of the base:");
            setTriangleBase(inputBiggerThanZeroDouble());
            System.out.println("Triangle area = " +
                    countTriangleArea(getTriangleHight(), getTriangleBase())
                    + " square meters" + "\n");

            System.out.println("Well done! Now let's calculate the rectangle area." + "\n" + "enter sideA length:");
            setRectSideA(inputBiggerThanZeroDouble());
            System.out.println("and sideB:");
            setRectSideB(inputBiggerThanZeroDouble());
            System.out.println("Rectangle area = " + countRectangleArea(getRectSideA(), getRectSideB()) +
                    " square meters" + "\n");

            System.out.println("And the last shape is a circle:" + "\n" + "enter the radius of a circle:");
            setRadius(inputBiggerThanZeroDouble());
            System.out.println("Circle area = " + countCircleArea(getRadius()) + " square meters" + "\n");

            System.out.println("Now, you can convert the temperature grades." + "\n" + "enter the Celsius grades:");
            setCelsius(inputDouble());
            System.out.println("in Fahrenheit it will be " + convertCtoF(getCelsius()));
            System.out.println("and Fahrenheit to Celsius (enter grades):");
            setFahrenheit(inputDouble());
            System.out.println("in Celsius it will be " + convertFtoC(getFahrenheit()) + "\n");

            System.out.println("Ok! Now you can calculate the distance between 2 points" + "\n"
                    + "Enter point A coordinate X");
            setPointAX(inputBiggerThanZeroDouble());
            System.out.println("Enter point A coordinate Y");
            setPointAY(inputBiggerThanZeroDouble());
            System.out.println("Enter point B coordinate X");
            setPointBX(inputBiggerThanZeroDouble());
            System.out.println("Enter point B coordinate Y");
            setPointBY(inputBiggerThanZeroDouble());
            System.out.println("The distance between point's A and B = "
                    + countDistance(getPointAX(), getPointAY(),
                    getPointBX(), getPointBY()) + " meters.");
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Please,restart program and enter just numbers in format #:");

        }
        System.out.println("That's all! Bye!");
    }
}

// didn't find any anti-pattern