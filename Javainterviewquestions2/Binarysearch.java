package Javainterviewquestions2;

import java.util.Arrays;

public class Binarysearch {
    public static void main(String[] args) {
        int arr[] = { 7, 6, 8, 9, 3, 4, 5, 2, 1 };
        int key = 2;

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
                System.out.println("Key found at postion " + mid);
                break;
            }
        }

    }

}
