package module04.task1;

public class Shapes {
    public static double countTriangleArea( double triangleBase, double triangleHight){
    //for round return statement to have 2 digits after a point: it's multiplied on 100, rounds and then divided on 100
        return (Math.ceil(((triangleBase * triangleHight)*0.5)*100))/100;
    }

    public static double countRectangleArea(double rectSideA, double rectSideB){
        return (Math.ceil((rectSideA * rectSideB)*100))/100;
    }

    public static double countCircleArea(double radius){
        return (Math.ceil(Math.PI * Math.pow(radius,2)*100))/100;
    }

}

//triangleHight - mistake

//аналогичный вопрос с округлением, как в Distance. Если мы возвращаем не стандартный дабл - может об этом в названии
//метода указать? не знаю, не знаю :)\

//ООП - мы сощдаем классы и методы, которые потом будем использовать повторно. Сегодня мы написали класс Shapes. Через
//год ты захочешь воспользоваться методом countCircleArea() и передашь туда отрицательное значение...
//И метод отработает и вернут результат. И ты на основе этого результата запустишь ракету в космос и не подозревая,
//что что-то пошло не так. И погибнут жители маленького городка. А если бы при передаче отрицательного значения у нас
//бы вылетела ошибка - ракета бы не запустилась. Печалька :(