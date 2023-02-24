package Javainterviewquestions2;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 4, 2, 9, 1 };
        System.out.println("the unsorted array is :" + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) { /// for descending order (arr[j]<arr[j+1])
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

        System.out.println("the sorted array is: " + Arrays.toString(arr));
    }

}
