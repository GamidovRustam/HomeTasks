package module06.task1;

import java.util.InputMismatchException;

import module04.task2.Temperatures;
import module04.task3.Distances;

import static module04.task1.Shapes.countTriangleArea;
import static module04.task1.Shapes.countRectangleArea;
import static module04.task1.Shapes.countCircleArea;

import static module06.task1.userInput.UserInput.inputDouble;
import static module06.task1.userInput.UserInput.inputPositiveDouble;


class Mod04WithExсeptions {
    public static void main(String[] args) {

        System.out.println("Let's calculate some shapes area, and we begin with triangle." + "\n"
                + "Enter the hight of triangle:");
        try {
            double triangleHight = inputPositiveDouble();
            System.out.println("now enter the length of the base:");
            double triangleBase = inputPositiveDouble();
            System.out.println("Triangle area = " +
                    countTriangleArea(triangleHight, triangleBase)
                    + " square meters" + "\n");

            System.out.println("Well done! Now let's calculate the rectangle area." + "\n" + "enter sideA length:");
            double rectSideA = inputPositiveDouble();
            System.out.println("and sideB:");
            double rectSideB = inputPositiveDouble();
            System.out.println("Rectangle area = " + countRectangleArea(rectSideA, rectSideB) + " square meters" + "\n");

            System.out.println("And the last shape is a circle:" + "\n" + "enter the radius of a circle:");
            double radius = inputPositiveDouble();
            System.out.println("Circle area = " + countCircleArea(radius) + " square meters" + "\n");

            Temperatures temperatures = new Temperatures();
            System.out.println("Now, you can convert the temperature grades." + "\n" + "enter the Celsius grades:");
            double celsius = inputDouble();
            System.out.println("in Fahrenheit it will be " + temperatures.convertCtoF(celsius));
            System.out.println("and Fahrenheit to Celsius (enter grades):");
            double fahrenheit = inputDouble();
            System.out.println("in Celsius it will be " + temperatures.convertFtoC(fahrenheit) + "\n");

            Distances distances = new Distances();
            System.out.println("Ok! Now you can calculate the distance between 2 points" + "\n"
                    + "Enter point A coordinate X");
            double pointAX = inputPositiveDouble();
            System.out.println("Enter point A coordinate Y");
            double pointAY = inputPositiveDouble();
            System.out.println("Enter point B coordinate X");
            double pointBX = inputPositiveDouble();
            System.out.println("Enter point B coordinate Y");
            double pointBY = inputPositiveDouble();
            System.out.println("The distance between point's A and B = "
                    + distances.countDistance(pointAX, pointAY,
                    pointBX, pointBY) + " meters.");
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Please,restart program and enter just numbers in format #:");

        }
        System.out.println("That's all! Bye!");
    }
}

// didn't find any anti-pattern