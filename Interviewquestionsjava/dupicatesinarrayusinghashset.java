package Interviewquestionsjava;

import java.util.HashSet;
import java.util.Scanner;

public class dupicatesinarrayusinghashset {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");

        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> hs1 = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (hs1.contains(arr[i])) {
                System.out.println(arr[i]);
            } else {
                hs1.add(arr[i]);
            }

        }

    }

}
