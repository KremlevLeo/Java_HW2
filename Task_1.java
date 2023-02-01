package HW2;

import java.util.Arrays;
import java.util.Random;

public class Task_1 {
    public static int[] bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 2; j++)
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
        return arr;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] myArr = new int[10];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = rand.nextInt(10) + 1;
        }
        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(myArr));
        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(bubbleSort(myArr)));
    }
}
