package Module04;
//по возможности не используй импорт со *. Указывай какой класс импортируешь
//введи дробное число или символ - найди баг
import Module04.Task1.*;
import Module04.Task2.*;
import Module04.Task3.*;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CounterOfShapesArea countArea = new CounterOfShapesArea();
        System.out.println("Let's calculate some shapes area, and we begin with triangle.");
        System.out.println("Enter the hight of triangle:");

        double triangleBase;
        double triangleHight;

        if (sc.hasNextDouble()) {
            triangleHight = sc.nextDouble();
            System.out.println("now enter the lenght of the base:");
            if (sc.hasNextDouble()) {
                triangleBase = sc.nextDouble();
                System.out.println("Triangle area = " + countArea.countTriangleArea(triangleHight, triangleBase) + " square meters");
            } else {
                System.out.println("not correct! Please, enter the number in format # or #.#:");
            }//запрашивается формат # or #.#, но дробные числа принять не можем
        } else {
            System.out.println("not correct! Please, enter the number in format # or #.#:");
        }

        System.out.println("Well done! Now let's calculate the rectangle area.");
        System.out.println("enter sideA lenght:");
        double rectSideA;
        double rectSideB;

        if (sc.hasNextDouble()) {
            rectSideA = sc.nextDouble();
            System.out.println("and sideB:");
            if (sc.hasNextDouble()) {
                rectSideB = sc.nextDouble();
                System.out.println("Rectangle area = " + countArea.countRectangleArea(rectSideA, rectSideB) + " square meters");
            } else {
                System.out.println("not correct! Please, enter the number in format # or #.#:");
            }
        } else {
            System.out.println("not correct! Please, enter the number in format # or #.#:");
        }

        System.out.println("And the last shape is a circle:");
        System.out.println("enter the radius of a circle:");

        double radius;

        if (sc.hasNextDouble()) {
            radius = sc.nextDouble();
            System.out.println("Circle area = " + countArea.countCircleArea(radius) + " square meters");
        } else {
            System.out.println("not correct! Please, enter the number in format # or #.#:");
        }


        TemperatureConverter temperature = new TemperatureConverter();
        System.out.println("Now, you can convert the temperature grades.");
        System.out.println("enter the Celsius grades:");

        double celsius;

        if (sc.hasNextDouble()) {
            celsius = sc.nextDouble();
            System.out.println("in Fahrenheit it will be " + temperature.convertCtoF(celsius));
        } else {
            System.out.println("not correct! Please, enter the number in format # or #.#:");
        }


        System.out.println("and Fahrenheit to Celsius (enter grades):");

        double fahrenheit;

        if (sc.hasNextDouble()) {
            fahrenheit = sc.nextDouble();
            System.out.println("in Celsius it will be " + temperature.convertFtoC(fahrenheit));
        } else {
            System.out.println("not correct! Please, enter the number in format # or #.#:");
        }


        DistanceCalculator distance = new DistanceCalculator();
        System.out.println("Ok! Now you can calculate the distance between 2 points");
        System.out.println("Enter point A coordinate X");

        double pointAX;
        double pointAY;
        double pointBX;
        double pointBY;
        //очень много одинаковых кусков кода. Подумай, как это можно оптимизировать
        if (sc.hasNextDouble()) {
            pointAX = sc.nextDouble();
            System.out.println("Enter point A coordinate Y");
            if (sc.hasNextDouble()) {
                pointAY = sc.nextDouble();
                System.out.println("Enter point B coordinate X");
                if (sc.hasNextDouble()) {
                    pointBX = sc.nextDouble();
                    System.out.println("Enter point B coordinate Y");
                    if (sc.hasNextDouble()) {
                        pointBY = sc.nextDouble();
                        System.out.println(distance.countDistance(pointAX, pointAY, pointBX, pointBY));
                    } else {
                        System.out.println("not correct! Please, enter the number in format # or #.#:");
                        System.out.println("That's all! Bye!");
                    }
                } else {
                    System.out.println("not correct! Please, enter the number in format # or #.#:");
                }
            } else {
                System.out.println("not correct! Please, enter the number in format # or #.#:");
            }
        }
    }
}
//если не знаешь еще как обрабатывать ошибки или делать циклы - может лучше тогда заканчивать программу
// и говорить что-то вроде: "вы ввели данные в неверном формате, поэтому программа завершает работу".
// И закончить выполнение. Чем выводить некорректную информацию