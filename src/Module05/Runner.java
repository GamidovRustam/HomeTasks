package module05;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args){
        int lenght = 10;
        int intArr1[] = new int[lenght];

        ArraysMethods arrMeth = new ArraysMethods();

        arrMeth.setRandomValues(intArr1);
        System.out.println("Array's elements before sorting:\n" + Arrays.toString(intArr1) + "\n");

        int max = arrMeth.findMaxValue(intArr1);
        System.out.println("maximal value = " + max);
        int min = arrMeth.findMinValue(intArr1);
        System.out.println("minimal value = " + min + "\n");

        int bubbleSortedArr[] = arrMeth.sortBubble(intArr1);
        System.out.println("Array is sorted by using \"Bubble\" algorithm:\n" + Arrays.toString(bubbleSortedArr) + "\n");


        int intArr2[] = new int[lenght];

        arrMeth.setRandomValues(intArr2);
        System.out.println("Now we are going to sort next array:\n" + Arrays.toString(intArr2) + "\n");
        System.out.println("Array is sorted by using \"Selection\" algorithm:");
        int selectSortedArr[] = arrMeth.sortSelection(intArr2);
        System.out.println(Arrays.toString(selectSortedArr));

    }
}

//папка Module05 != пакет module05

//Создать второй массив и передавать его во второй метод сортировки - это не решение бага.
//Ты хочешь передать новый отсортированный массив и оставить оригинальный неизменным. Но оригинальный тоже меняется.
//Нужно или придумать как оставить его неизменным или менять его осмысленно, как в методе Arrays.sort - ты передаешь
//ему свой массив и он его сортирует, а не передает другой отсортированный. Так тоже можно, но нужно чуть подправить
//код, не создавать лишние два массива

//во многих местав в этом классе можно избавиться от одноразвых переменных и лишних строк,
//если объеденить две строки в одну. Например, стр15-16, 17-18, 29-30..
//Можно оставлять перемнные, но это должно быть обоснованно