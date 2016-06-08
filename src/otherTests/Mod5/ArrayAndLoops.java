package otherTests.Mod5;

import java.util.Arrays;

public class ArrayAndLoops {
    public static void main(String[] args) {
        double[] doubleArray = {1.2, 2.2, 3.3, -10.0, 5.0};

//        Сортировка Пузырьком:
//        boolean swapOccured = true;
//
//        while (swapOccured){
//            swapOccured = false;
//            for (int i = 0; i < doubleArray.length - 1; i++){
//                if  (doubleArray[i] > doubleArray[i +1]){
//                    double tempVar = doubleArray[i];
//
//                    doubleArray[i] = doubleArray[i + 1];
//                    doubleArray[i + 1] = tempVar;
//
//                    swapOccured = true;
//                }
//            }
//        }
        Arrays.sort(doubleArray);

        for (double element : doubleArray){
            System.out.println(element);
        }
    }
}
