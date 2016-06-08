package Module05;

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
        int[] sortedArr = arr;
        int index = 0;
        int min = 0;

        for (int i = 0; i < sortedArr.length; i++){
            min = sortedArr[i];
            index = i;

            for (int a = i + 1; a < sortedArr.length; a++){
                if (sortedArr[a] < min){
                    index = a;
                    min = sortedArr[a];
                }
            }
            if (sortedArr[i] != sortedArr[index]) {
                sortedArr[index] = sortedArr[i];
                sortedArr[i] = min;
            }
        }
        return sortedArr;
    }
}
