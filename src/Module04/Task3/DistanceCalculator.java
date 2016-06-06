package Module04.Task3;

public class DistanceCalculator {
    private static double pointAX;
    private static double pointAY;
    private static double pointBX;
    private static double pointBY;


    public double countDistance(double pointAX, double pointAY, double pointBX, double pointBY) {
        setPointAX(pointAX);
        setPointAY(pointAY);
        setPointBX(pointBX);
        setPointBY(pointBY);
        return (Math.ceil(Math.sqrt((Math.pow(pointAX - pointBX, 2) + Math.pow(pointAY - pointBY, 2))) * 100)) / 100;
    }

    public static double getPointAX() {
        return pointAX;
    }

    public static void setPointAX(double pointAX) {
        DistanceCalculator.pointAX = pointAX;
    }

    public static double getPointAY() {
        return pointAY;
    }

    public static void setPointAY(double pointAY) {
        DistanceCalculator.pointAY = pointAY;
    }

    public static double getPointBX() {
        return pointBX;
    }

    public static void setPointBX(double pointBX) {
        DistanceCalculator.pointBX = pointBX;
    }

    public static double getPointBY() {
        return pointBY;
    }

    public static void setPointBY(double pointBY) {
        DistanceCalculator.pointBY = pointBY;
    }
}

