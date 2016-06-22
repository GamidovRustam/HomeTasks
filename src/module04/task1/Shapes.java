package module04.task1;

import java.util.InputMismatchException;

public class Shapes {
    public static double countTriangleArea(double triangleBase, double triangleHeight){
        if (triangleBase < 0 || triangleHeight < 0) {
            throw new InputMismatchException("Wrong! The base or height of triangle must be bigger than zero!");
        }
    //for round return statement to have 2 digits after a point: it's multiplied on 100, rounds and then divided on 100
        return (triangleBase * triangleHeight)*0.5;
    }

    public static double countRectangleArea(double rectSideA, double rectSideB){
        if (rectSideA < 0 || rectSideB < 0) {
            throw new InputMismatchException("Wrong! The sides of rectangle must be bigger than zero!");
        }
        return rectSideA * rectSideB;
    }

    public static double countCircleArea(double radius){
        if (radius <0) {
            throw new InputMismatchException("Wrong! Radius of circle must be bigger than zero!");
        }
        return Math.PI * Math.pow(radius,2);
    }
}

