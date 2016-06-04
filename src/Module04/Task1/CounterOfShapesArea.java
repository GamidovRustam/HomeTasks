package Module04.Task1;

public class CounterOfShapesArea {
    public double countTriangleArea(double base, double hight){
        return (base * hight)*0.5;
    }
    public double countRectangleArea(double sideA, double sideB){
        return sideA * sideB;
    }
    public double countCircleArea(double radius){
        return (Math.ceil(Math.PI * Math.pow(radius,2)*100))/100;
    }

}
