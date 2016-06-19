package module05;

import java.util.Arrays;

import static module05.MyArrays.*;

class Runner {
    public static void main(String[] args){
        int lenght = 10;
        int[] intArr = new int[lenght];



        System.out.println("Array before sorting:\n" + Arrays.toString(setRandomValues(intArr)) + "\n");

        System.out.println("maximal value = " + findMaxValue(intArr));
        System.out.println("minimal value = " + findMinValue(intArr) + "\n");

        System.out.println("Array is sorted by using \"Bubble\" algorithm:\n" +
                            Arrays.toString(sortBubble(intArr.clone())) + "\n");
//        System.out.println("Now we are going to sort next array:\n" + Arrays.toString(intArr) + "\n");
        System.out.println("Array is sorted by using \"Selection\" algorithm:" + "\n" +
                            Arrays.toString(sortSelection(intArr.clone())));
    }
}
//папка module05 != пакет module05

//Создать второй массив и передавать его во второй метод сортировки - это не решение бага.
//Ты хочешь передать новый отсортированный массив и оставить оригинальный неизменным. Но оригинальный тоже меняется.
//Нужно или придумать как оставить его неизменным или менять его осмысленно, как в методе Arrays.sort - ты передаешь
//ему свой массив и он его сортирует, а не передает другой отсортированный. Так тоже можно, но нужно чуть подправить
//код, не создавать лишние два массива

//во многих местав в этом классе можно избавиться от одноразвых переменных и лишних строк,
//если объеденить две строки в одну. Например, стр15-16, 17-18, 29-30..
//Можно оставлять перемнные, но это должно быть обоснованно