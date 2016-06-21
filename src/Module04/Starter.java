package module04;
//по возможности не используй импорт со *. Указывай какой класс импортируешь
//введи дробное число или символ - найди баг

class Starter {
    public static void main(String[] args) {
//        String error = "not correct! Please,restart program and enter the number in format # or #,#:";
//
//        Scanner sc = new Scanner(System.in);
//        Shapes countArea = new Shapes();
//        System.out.println("Let's calculate some shapes area, and we begin with triangle.");
//        System.out.println("Enter the hight of triangle:");
//
//        if (sc.hasNextDouble()) {
//            countArea.setTriangleHight(sc.nextDouble());
//            System.out.println("now enter the lenght of the base:");
//            if (sc.hasNextDouble()) {
//                countArea.setTriangleBase(sc.nextDouble());
//                System.out.println("Triangle area = " +
//                                    countArea.countTriangleArea(countArea.getTriangleHight(), countArea.getTriangleBase())
//                                    + " square meters");
//                System.out.println("");
//
//
//                System.out.println("Well done! Now let's calculate the rectangle area.");
//                System.out.println("enter sideA lenght:");
//                if (sc.hasNextDouble()) {
//                    countArea.setRectSideA(sc.nextDouble());
//                    System.out.println("and sideB:");
//                    if (sc.hasNextDouble()) {
//                        countArea.setRectSideB(sc.nextDouble());
//                        System.out.println("Rectangle area = " +
//                                            countArea.countRectangleArea(countArea.getRectSideA(), countArea.getRectSideB()) +
//                                            " square meters");
//                        System.out.println("");
//                        System.out.println("And the last shape is a circle:");
//                        System.out.println("enter the radius of a circle:");
//
//                        if (sc.hasNextDouble()) {
//                            countArea.setRadius(sc.nextDouble());
//                            System.out.println("Circle area = " + countArea.countCircleArea(countArea.getRadius()) + " square meters");
//                            System.out.println("");
//
//
//                            Temperatures temperature = new Temperatures();
//                            System.out.println("Now, you can convert the temperature grades.");
//                            System.out.println("enter the Celsius grades:");
//
//                            if (sc.hasNextDouble()) {
//                                temperature.setCelsius(sc.nextDouble());
//                                System.out.println("in Fahrenheit it will be " + temperature.convertCtoF(temperature.getCelsius()));
//                                System.out.println("and Fahrenheit to Celsius (enter grades):");
//
//                                if (sc.hasNextDouble()) {
//                                    temperature.setFahrenheit(sc.nextDouble());
//                                    System.out.println("in Celsius it will be " + temperature.convertFtoC(temperature.getFahrenheit()));
//                                    System.out.println("");
//
//                                    Distance distance = new Distance();
//                                    System.out.println("Ok! Now you can calculate the distance between 2 points");
//                                    System.out.println("Enter point A coordinate X");
//                                    //очень много одинаковых кусков кода. Подумай, как это можно оптимизировать
//                                    if (sc.hasNextDouble()) {
//                                        distance.setPointAX(sc.nextDouble());
//                                        System.out.println("Enter point A coordinate Y");
//                                        if (sc.hasNextDouble()) {
//                                            distance.setPointAY(sc.nextDouble());
//                                            System.out.println("Enter point B coordinate X");
//                                            if (sc.hasNextDouble()) {
//                                                distance.setPointBX(sc.nextDouble());
//                                                System.out.println("Enter point B coordinate Y");
//                                                if (sc.hasNextDouble()) {
//                                                    distance.setPointBY(sc.nextDouble());
//                                                    System.out.println("The distance between point's A and B = "
//                                                                        +distance.countDistance(distance.getPointAX(),
//                                                                                                distance.getPointAY(),
//                                                                                                distance.getPointBX(),
//                                                                                                distance.getPointBY())+
//                                                                        " meters.");
//                                                    System.out.println("That's all! Bye!");
//                                                } else {
//                                                    System.out.println(error);
//                                                }
//                                            } else {
//                                                System.out.println(error);
//                                            }
//                                        } else {
//                                            System.out.println(error);
//                                        }
//                                    }
//                                } else {
//                                    System.out.println(error);
//                                }//запрашивается формат # or #.#, но дробные числа принять не можем
//                            } else {
//                                System.out.println(error);
//                            }
//                        } else {
//                            System.out.println(error);
//                        }
//                    } else {
//                        System.out.println(error);
//                    }
//                } else {
//                    System.out.println(error);
//                }
//
//            } else {
//                System.out.println(error);
//            }
//
//        } else {
//            System.out.println(error);
//        }
    }
}
//если не знаешь еще как обрабатывать ошибки или делать циклы - может лучше тогда заканчивать программу
// и говорить что-то вроде: "вы ввели данные в неверном формате, поэтому программа завершает работу".
// И закончить выполнение. Чем выводить некорректную информацию