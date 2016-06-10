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

//стр7//
//если переменную обьявить как "int length" - коментарии будут не нужны//

//стр10//
//этот коментарий тоже не нужен будет, если создать метод//

//стр12//
//зачем нужно округление в рандомных числах если есть приведение к инт?//

//форматировани//
//после цикла обычно хорошо бы поставить пустую строку, а вот две пустые строки обычно издишни. Зря увеличивают размер класса//

//стр16...//
//можно использовать "/n" для переноса строки, чтобы не писать лишние System.out.println();//

//стр32//
//System.out.println("Now we are going to sort next array:\n" + Arrays.toString(intArr) + "\n");//
//раскоментируй и скопируй эту записать выше в строчку 32 и найди баг//

//Package names are written in all lower case to avoid conflict with the names of classes or interfaces.//
//https://docs.oracle.com/javase/tutorial/java/package/namingpkgs.html//

//лишнее в репозитории
//Homeworks.iml
//.idea
//out