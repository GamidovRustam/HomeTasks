package Module04;

import Module04.Task1.*;

public class Starter {
    public static void main(String[] args) {
        CounterOfShapesArea countArea = new CounterOfShapesArea();
        System.out.println("Triangle area = " + countArea.countTriangleArea(326,432) + " square meters");
        System.out.println("Rectangle area = " + countArea.countRectangleArea(25,41) + " square meters");
        System.out.println("Circle area = " + countArea.countCircleArea(25) + " square meters");

        TemperatureConverter temperature = new TemperatureConverter();
        System.out.println(temperature.convertCtoF(32.5));
        System.out.println(temperature.convertFtoC(90.5));

        DistanceCalculator distance = new DistanceCalculator();
        System.out.println(distance.countDistance(3,9,6,3));


    }
}
