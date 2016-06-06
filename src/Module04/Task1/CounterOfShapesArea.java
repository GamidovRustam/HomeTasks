package Module04.Task1;

public class CounterOfShapesArea {
    private static double triangleBase;
    private static double triangleHight;
    private static double rectSideA;
    private static double rectSideB;
    private static double radius;


    public static double countTriangleArea( double triangleBase, double triangleHight){
        setTriangleBase(triangleBase);
        setTriangleHight(triangleHight);
        return (triangleBase * triangleHight)*0.5;
    }
    //зачем нам создавать обьект для вызова этих методов? Что если сделать их статическими?
    public double countRectangleArea(double rectSideA, double rectSideB){
        setRectSideA(rectSideA);
        setRectSideB(rectSideB);
        return rectSideA * rectSideB;
    }

    public double countCircleArea(double radius){
        setRadius(radius);
        return (Math.ceil(Math.PI * Math.pow(radius,2)*100))/100;
    }

    public static double getTriangleBase() {
        return triangleBase;
    }

    public static void setTriangleBase(double triangleBase) {
        CounterOfShapesArea.triangleBase = triangleBase;
    }

    public static double getTriangleHight() {
        return triangleHight;
    }

    public static void setTriangleHight(double triangleHight) {
        CounterOfShapesArea.triangleHight = triangleHight;
    }

    public static double getRectSideA() {
        return rectSideA;
    }

    public static void setRectSideA(double rectSideA) {
        CounterOfShapesArea.rectSideA = rectSideA;
    }

    public static double getRectSideB() {
        return rectSideB;
    }

    public static void setRectSideB(double rectSideB) {
        CounterOfShapesArea.rectSideB = rectSideB;
    }

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double radius) {
        CounterOfShapesArea.radius = radius;
    }
}

