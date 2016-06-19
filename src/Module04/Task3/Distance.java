package module04.task3;

public class Distance {
    private static double pointAX;
    private static double pointAY;
    private static double pointBX;
    private static double pointBY;


    public static double countDistance(double pointAX, double pointAY, double pointBX, double pointBY) {
        return (Math.ceil(Math.sqrt((Math.pow(pointAX - pointBX, 2) + Math.pow(pointAY - pointBY, 2))) * 100)) / 100;
    }

    public static double getPointAX() {
        return pointAX;
    }

    public static void setPointAX(double pointAX) {
        Distance.pointAX = pointAX;
    }

    public static double getPointAY() {
        return pointAY;
    }

    public static void setPointAY(double pointAY) {
        Distance.pointAY = pointAY;
    }

    public static double getPointBX() {
        return pointBX;
    }

    public static void setPointBX(double pointBX) {
        Distance.pointBX = pointBX;
    }

    public static double getPointBY() {
        return pointBY;
    }

    public static void setPointBY(double pointBY) {
        Distance.pointBY = pointBY;
    }
}

//баг с пакетами - не совпадает регистр букв

//Расстояние с полями-точками - почему все статическое? Почему бы нам не создавать обьект этого класса?