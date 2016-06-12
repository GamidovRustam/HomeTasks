package module05;

public class ArraysMethods {
    public static int[] setRandomValues(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static int findMaxValue(int[] arr){
        int max = 0;

        for (int anArr : arr) {
            max = anArr;
            for (int anArr1 : arr) {
                if (max < anArr1) {
                    max = anArr1;
                }
            }
        }
        return max;
    }

    public static int findMinValue(int[] arr){
        int min = 0;

        for (int anArr : arr) {
            min = anArr;
            for (int anArr1 : arr) {
                if (min > anArr1) {
                    min = anArr1;
                }
            }
        }
        return min;
    }

    public static int[] sortBubble(int[] arr){
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = arr.length-1; j >= i; j--) {
                if (arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sortSelection(int[] arr){
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

//<<<<<<< Updated upstream
//почему методы не статические? С какой целью ты создаешь обьект ArraysMethods?
//=======
//Найди баг, который указан в классе Runner3//

