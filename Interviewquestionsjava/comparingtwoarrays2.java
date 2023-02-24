package Interviewquestionsjava;

import java.util.Arrays;

public class comparingtwoarrays2 { // we'll be comparing two arrays checking whether they contai the elements or
                                   // not

    public static void main(String[] args) {
        int a1[] = { 1, 2, 3, 4, 5 }; // the first array
        int a2[] = { 3, 4, 1, 2, 5 }; // the second array

        Arrays.sort(a1); // then we are soring the first array
        Arrays.sort(a2); // then we are sorting the second array
        boolean status = true;

        if (a1.length == a2.length) {
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] == a2[i]) {
                    status = true;

                }
            }

        }

        else {
            status = false;

        }

        if (status == true) {
            System.out.println("The arrays are equaal");
        } else {
            System.out.println("Arrays are not equal");
        }

    }

}
