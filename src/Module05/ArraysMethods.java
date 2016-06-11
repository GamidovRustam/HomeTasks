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

// форматирование
// = и * окружи пробелами



//Подсказка с багом в сортировке в sortBubble
//или по-другому копируй содержимое одного массива в другой или не создавай вообще ненужный массив
//и работай с оригинальным.

//setRandomValues() - какую функцию выполняет массив randomValues?

//почему методы не статические? С какой целью ты создаешь обьект ArraysMethods?