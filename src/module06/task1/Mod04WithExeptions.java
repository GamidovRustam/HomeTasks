package module06.task1;

import Module04.Task1.CounterOfShapesArea;
import Module04.Task2.TemperatureConverter;
import Module04.Task3.DistanceCalculator;
import module06.task1.chekInput.CheckInput;

public class Mod04WithExeptions {
    public static void main(String[] args) {
        CheckInput checkInput = new CheckInput();
        CounterOfShapesArea countArea = new CounterOfShapesArea();

        System.out.println("Let's calculate some shapes area, and we begin with triangle." + "\n"
                + "Enter the hight of triangle:");
        double userInput = checkInput.ifBiggerThanZeroDouble();
        countArea.setTriangleHight(userInput);
        System.out.println("now enter the lenght of the base:");
        countArea.setTriangleBase(checkInput.ifBiggerThanZeroDouble());
        System.out.println("Triangle area = " +
                countArea.countTriangleArea(countArea.getTriangleHight(), countArea.getTriangleBase())
                + " square meters" + "\n");

        System.out.println("Well done! Now let's calculate the rectangle area." + "\n" + "enter sideA lenght:");
        countArea.setRectSideA(checkInput.ifBiggerThanZeroDouble());
        System.out.println("and sideB:");
        countArea.setRectSideB(checkInput.ifBiggerThanZeroDouble());
        System.out.println("Rectangle area = " +
                countArea.countRectangleArea(countArea.getRectSideA(), countArea.getRectSideB()) +
                " square meters" + "\n");

        System.out.println("And the last shape is a circle:" + "\n" + "enter the radius of a circle:");
        countArea.setRadius(checkInput.ifBiggerThanZeroDouble());
        System.out.println("Circle area = " + countArea.countCircleArea(countArea.getRadius())
                + " square meters" + "\n");

        TemperatureConverter temperature = new TemperatureConverter();

        System.out.println("Now, you can convert the temperature grades." + "\n" + "enter the Celsius grades:");
        temperature.setCelsius(checkInput.ifDouble());
        System.out.println("in Fahrenheit it will be " + temperature.convertCtoF(temperature.getCelsius()));
        System.out.println("and Fahrenheit to Celsius (enter grades):");
        temperature.setFahrenheit(checkInput.ifDouble());
        System.out.println("in Celsius it will be " + temperature.convertFtoC(temperature.getFahrenheit()) + "\n");

        DistanceCalculator distance = new DistanceCalculator();

        System.out.println("Ok! Now you can calculate the distance between 2 points" + "\n"
                + "Enter point A coordinate X");
        distance.setPointAX(checkInput.ifBiggerThanZeroDouble());
        System.out.println("Enter point A coordinate Y");
        distance.setPointAY(checkInput.ifBiggerThanZeroDouble());
        System.out.println("Enter point B coordinate X");
        distance.setPointBX(checkInput.ifBiggerThanZeroDouble());
        System.out.println("Enter point B coordinate Y");
        distance.setPointBY(checkInput.ifBiggerThanZeroDouble());
        System.out.println("The distance between point's A and B = "
                + distance.countDistance(distance.getPointAX(), distance.getPointAY(),
                                        distance.getPointBX(), distance.getPointBY()) + " meters.");

        System.out.println("That's all! Bye!");
    }
}
