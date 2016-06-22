package module04.task3;

import java.util.InputMismatchException;

public class Distances {
    public static double countDistance(double pointAX, double pointAY, double pointBX, double pointBY) {
        if (pointAX < 0 || pointAY < 0 || pointBX < 0 || pointBY < 0) {
            throw new InputMismatchException("Wrong parameters! The point coordinate must be bigger than zero!");
        }
        return Math.sqrt((Math.pow(pointAX - pointBX, 2) + Math.pow(pointAY - pointBY, 2)));
    }
}

//лишняя пара скобок//

//вопрос на сколько логично из метода возвращать округленный дабл. А если нам все таки нужно будет иметь больше знаков//
//после запятой - создавать еще один метод? Может логичнее обрезать лишние символы при вызове (в нашем случае в методе мейн)?//