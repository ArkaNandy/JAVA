package Interviewquestionsjava;

import java.util.HashSet;
import java.util.Scanner;

public class duplicatesusinghashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = 5;

        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 8, 7 };
        HashSet<Integer> hs1 = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int input = sc.nextInt();
            if (hs1.contains(input)) {
                System.out.println(input);
            } else {
                hs1.add(input);

            }
        }

    }

}
