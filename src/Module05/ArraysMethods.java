package module05;

public class ArraysMethods {
    public static int[] setRandomValues(int[] arr){
        int[] randomValues= arr;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        return randomValues;
    }

    public int findMaxValue(int[] arr){
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            max = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (max < arr[j]){
                    max = arr[j];
                }
            }
        }
        return max;
    }

    public int findMinValue(int[] arr){
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (min > arr[j]){
                    min = arr[j];
                }
            }
        }
        return min;
    }

    public int[] sortBubble(int[] arr){
        int[] sortedArr = arr;

        for (int i = 1; i < sortedArr.length - 1; i++) {
            for (int j = sortedArr.length-1; j >= i; j--) {
                if (sortedArr[j-1] > sortedArr[j]){
                    int temp = sortedArr[j-1];
                    sortedArr[j-1] = sortedArr[j];
                    sortedArr[j] = temp;
                }
            }
        }
        return sortedArr;
    }

    public int[] sortSelection(int[] arr){
        int index;
        int min;

        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min){
                    index = j;
                    min = arr[j];
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
//комментарии бывают нужны, когда они нужны)//
//но в данном случае я по хороему назавнию метода иего сигнатуре и так понятно что этот метод делает.//
//Тратится лишнее время на прочтение комментария//
//Если счтаешь их нужными - можешь оставить. Не критично//

//форматирование//
//в методах сортировки циклы выделены пустыми строками, а в поиске максимумов - нет. Приведи к одному виду//

//для верхнего цикла принято использовать переменную i, для следующего вложенного - j.//
//Пременная "а" во втором цикле сбивает с толку//

//стр7...//
//Перед открывающей фигурной скобкой - пробел//
//http://www.oracle.com/technetwork/java/javase/documentation/codeconventions-141388.html//

//стр3
//public class ArraysSort - но класс то не только сортирует массивы, но еще и находит граничные значения.//

//Найди баг, который указан в классе Runner//

//ненужный импорт?//

//'for' loop replaceable with 'foreach'

//стр53, 54//
//нет необходимости зжесь явно инициализировать нулем. Это произойдет автоматически. СЕйчас это антипаттерн magic number//