package module04.task3;

public class Distances {
    public static double countDistance(double pointAX, double pointAY, double pointBX, double pointBY) {
    //for round return statement to have 2 digits after a point: it's multiplied on 100, rounds and then divided on 100
        return (Math.ceil(Math.sqrt((Math.pow(pointAX - pointBX, 2) + Math.pow(pointAY - pointBY, 2))) * 100)) / 100;
    }
}