package Module05;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int n = 10;// setting the array length
        int intArr[] = new int[n];

//        this loop assign the random values to array elements
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = (int) Math.round(Math.random()*100);
        }
        System.out.println("Array's elements before sorting:");
        System.out.println(Arrays.toString(intArr));
        System.out.println();


        ArraysSort arrSort = new ArraysSort();
        int max = arrSort.findMaxValue(intArr); // calling method that returns maximal value of array
        System.out.println("maximal value = " + max);

        int min = arrSort.findMinValue(intArr); // calling method that returns minimal value of array
        System.out.println("minimal value = " + min);
        System.out.println();


        int bubbleSortedArr[] = arrSort.bubbleSort(intArr);
        System.out.println("Array is sorted by using 'Bubble' algorithm:");
        System.out.println(Arrays.toString(bubbleSortedArr));
        System.out.println();

        System.out.println("Now we are going to sort next array:\n" + Arrays.toString(intArr) + "\n");
        System.out.println("Array is sorted by using 'Selection' algorithm:");
        int selectSortedArr[] = arrSort.selectSort(intArr);
        System.out.println(Arrays.toString(selectSortedArr));


    }
}

//стр7
//если переменную обьявить как "int length" - коментарии будут не нужны

//стр10
//этот коментарий тоже не нужен будет, если создать метод

//стр12
//зачем нужно округление в рандомных числах если есть приведение к инт?

//форматировани
//после цикла обычно хорошо бы поставить пустую строку, а вот две пустые строки обычно издишни. Зря увеличивают размер класса

//стр16...
//можно использовать "/n" для переноса строки, чтобы не писать лишние System.out.println();

//стр32
//System.out.println("Now we are going to sort next array:\n" + Arrays.toString(intArr) + "\n");
//раскоментируй и скопируй эту записать выше в строчку 32 и найди баг

//Package names are written in all lower case to avoid conflict with the names of classes or interfaces.
//https://docs.oracle.com/javase/tutorial/java/package/namingpkgs.html

//лишнее в репозитории
//Homeworks.iml
//.idea
//out