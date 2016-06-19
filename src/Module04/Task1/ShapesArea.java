package module04.task1;

public class ShapesArea {
    private static double triangleBase;
    private static double triangleHight;
    private static double rectSideA;
    private static double rectSideB;
    private static double radius;

    public static double countTriangleArea( double triangleBase, double triangleHight){
        return (triangleBase * triangleHight)*0.5;
    }

    public static double countRectangleArea(double rectSideA, double rectSideB){
        return rectSideA * rectSideB;
    }

    public static double countCircleArea(double radius){
        return (Math.ceil(Math.PI * Math.pow(radius,2)*100))/100;
    }

    public static double getTriangleBase() {
        return triangleBase;
    }

    public static void setTriangleBase(double triangleBase) {
        ShapesArea.triangleBase = triangleBase;
    }

    public static double getTriangleHight() {
        return triangleHight;
    }

    public static void setTriangleHight(double triangleHight) {
        ShapesArea.triangleHight = triangleHight;
    }

    public static double getRectSideA() {
        return rectSideA;
    }

    public static void setRectSideA(double rectSideA) {
        ShapesArea.rectSideA = rectSideA;
    }

    public static double getRectSideB() {
        return rectSideB;
    }

    public static void setRectSideB(double rectSideB) {
        ShapesArea.rectSideB = rectSideB;
    }

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double radius) {
        ShapesArea.radius = radius;
    }
}

