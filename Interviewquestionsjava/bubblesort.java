package Interviewquestionsjava;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 9, 12, 11, 6, 2 };
        System.out.println("The unsorted array is" + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("The sorted  array is" + Arrays.toString(arr));

    }

}
