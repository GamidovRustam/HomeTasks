package Module05;

import java.util.Arrays;

public class ArraysSort {
    // this method finds the maximal value of array
    public int findMaxValue(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            max = arr[i];
            for (int a = 0; a < arr.length; a++){
                if (max < arr[a]){
                    max = arr[a];
                }
            }
        }
        return max;
    }

    // this method finds the minimal value of array
    public int findMinValue(int[] arr){
        int min = 0;
        for (int i = 0; i < arr.length; i++){
            min = arr[i];
            for (int a = 0; a < arr.length; a++){
                if (min > arr[a]){
                    min = arr[a];
                }
            }
        }
        return min;
    }

    // this method sorts array by using 'Bubble' algorithm
    public int[] bubbleSort(int[] arr){
        int[] sortedArr = arr;

        for (int i = 1; i < sortedArr.length - 1; i++){
            for (int a = sortedArr.length-1; a >= i; a--){
                if (sortedArr[a-1] > sortedArr[a]){
                    int temp = sortedArr[a-1];
                    sortedArr[a-1] = sortedArr[a];
                    sortedArr[a] = temp;
                }
            }
        }

        return sortedArr;
    }

    // this method sorts array by using 'Selection' algorithm
    public int[] selectSort(int[] arr){
        int index = 0;
        int min = 0;

        for (int i = 0; i < arr.length; i++){
            min = arr[i];
            index = i;

            for (int a = i + 1; a < arr.length; a++){
                if (arr[a] < min){
                    index = a;
                    min = arr[a];
                }
            }
            if (arr[i] != arr[index]) {
                arr[index] = arr[i];
                arr[i] = min;
            }
        }
        return arr;
    }
}

//стр4
//комментарии бывают нужны, когда они нужны)
//но в данном случае я по хороему назавнию метода иего сигнатуре и так понятно что этот метод делает.
//Тратится лишнее время на прочтение комментария
//Если счтаешь их нужными - можешь оставить. Не критично

//форматирование
//в методах сортировки циклы выделены пустыми строками, а в поиске максимумов - нет. Приведи к одному виду

//для верхнего цикла принято использовать переменную i, для следующего вложенного - j.
//Пременная "а" во втором цикле сбивает с толку

//стр7...
//Перед открывающей фигурной скобкой - пробел
//http://www.oracle.com/technetwork/java/javase/documentation/codeconventions-141388.html

//стр3
//public class ArraysSort - но класс то не только сортирует массивы, но еще и находит граничные значения.

//Найди баг, который указан в классе Runner

//ненужный импорт?

//'for' loop replaceable with 'foreach'

//стр53, 54
//нет необходимости зжесь явно инициализировать нулем. Это произойдет автоматически. СЕйчас это антипаттерн magic number