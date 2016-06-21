package module04.task1;

public class Shapes {
    public static double countTriangleArea( double triangleBase, double triangleHight){
    //for round return statement to have 2 digits after a point: it's multiplied on 100, rounds and then divided on 100
        return (Math.ceil(((triangleBase * triangleHight)*0.5)*100))/100;
    }

    public static double countRectangleArea(double rectSideA, double rectSideB){
        return (Math.ceil((rectSideA * rectSideB)*100))/100;
    }

    public static double countCircleArea(double radius){
        return (Math.ceil(Math.PI * Math.pow(radius,2)*100))/100;
    }

}