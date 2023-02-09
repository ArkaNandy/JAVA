package Interviewquestionsjava;

import java.util.HashSet;
import java.util.Scanner;

public class intersectionoftwoarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = { 1, 2, 7, 9, 5, 4, 3 };
        int[] arr2 = { 3, 37, 7, 5, 12, 22, 9 };
        HashSet<Integer> hs1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    hs1.add(arr1[i]);
                }
            }

        }
        System.out.println("The common elements in the array are" + hs1);
    }

}
