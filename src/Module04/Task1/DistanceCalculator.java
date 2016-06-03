package Module04.Task1;

public class DistanceCalculator {


    public double countDistance(double x1, double y1, double x2, double y2){
        return (Math.ceil(Math.sqrt((Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2)))*100))/100;
    }
}
