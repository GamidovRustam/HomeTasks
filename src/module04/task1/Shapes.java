package module04.task1;

import java.util.InputMismatchException;

public class Shapes {
    public static double countTriangleArea(double triangleBase, double triangleHeight){
        if (triangleBase < 0 || triangleHeight < 0) {
            throw new InputMismatchException("Wrong! The base or height of triangle must be bigger than zero!");
        }
        return (triangleBase * triangleHeight)*0.5;
    }

    public static double countRectangleArea(double rectSideA, double rectSideB){
        if (rectSideA < 0 || rectSideB < 0) {
            throw new InputMismatchException("Wrong! The sides of rectangle must be bigger than zero!");
        }
        return rectSideA * rectSideB;
    }

    public static double countCircleArea(double radius){
        if (radius <0) {
            throw new InputMismatchException("Wrong! Radius of circle must be bigger than zero!");
        }
        return Math.PI * Math.pow(radius,2);
    }
}

//triangleHight - mistake//

//аналогичный вопрос с округлением, как в Distance. Если мы возвращаем не стандартный дабл - может об этом в названии//
//метода указать? не знаю, не знаю :)//

//ООП - мы сощдаем классы и методы, которые потом будем использовать повторно. Сегодня мы написали класс Shapes. Через//
//год ты захочешь воспользоваться методом countCircleArea() и передашь туда отрицательное значение...//
//И метод отработает и вернут результат. И ты на основе этого результата запустишь ракету в космос и не подозревая,//
//что что-то пошло не так. И погибнут жители маленького городка. А если бы при передаче отрицательного значения у нас//
//бы вылетела ошибка - ракета бы не запустилась. Печалька :(//