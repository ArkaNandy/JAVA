package Interviewquestionsjava;

import java.util.Arrays;

public class binarysearch2 {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 5, 4, 8, 9, 12 };
        int key = 12;
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (key < arr[mid]) {
                end = mid - 1;
            }
            if (key > arr[mid]) {
                start = mid + 1;
            } else {
                System.out.println("Element found " + mid);
                break;
            }

        }

    }

}
