package module04.task3;

public class Distances {
    public static double countDistance(double pointAX, double pointAY, double pointBX, double pointBY) {
    //for round return statement to have 2 digits after a point: it's multiplied on 100, rounds and then divided on 100
        return (Math.ceil(Math.sqrt((Math.pow(pointAX - pointBX, 2) + Math.pow(pointAY - pointBY, 2))) * 100)) / 100;
    }
}

//лишняя пара скобок

//вопрос на сколько логично из метода возвращать округленный дабл. А если нам все таки нужно будет иметь больше знаков
//после запятой - создавать еще один метод? Может логичнее обрезать лишние символы при вызове (в нашем случае в методе мейн)?