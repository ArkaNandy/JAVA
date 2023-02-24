package Javainterviewquestions2;

import java.util.Arrays;

public class comparingtwoarrays {
    public static void main(String[] args) {
        int arr1[] = { 3, 2, 5, 6, 9, 12 };
        int arr2[] = { 6, 5, 2, 3, 9, 12 };
        String arr3[] = { "Ryam", "Shya", "jadhu" };
        String arr4[] = { "Ryam", "Shya", "jadhu" };

        char arr[] = { 'a', 'b', 'c' };
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean status = true;

        if (arr3.length == arr4.length) {
            for (int i = 0; i < arr3.length; i++) {
                if (arr1[i] == arr2[i]) {
                    status = true;
                } else {
                    status = false;
                }
            }
        }

        if (status == true) {
            System.out.println("Both the arrays are similar");
        } else {
            System.out.println("Both arrays are not same");
        }

    }

}
