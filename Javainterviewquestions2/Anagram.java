package Javainterviewquestions2;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String input1 = sc.nextLine();

        System.out.println("Enter the second string");
        String input2 = sc.nextLine();

        String a = input1.replaceAll(" ", "").toLowerCase();
        String b = input2.replaceAll(" ", "").toLowerCase();

        if (a.length() != b.length()) {
            System.out.println("They are not anagrams");
        } else {
            char c1[] = a.toCharArray();
            char c2[] = b.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if (Arrays.equals(c1, c2)) {
                System.out.println("they are anagrams");

            } else {
                System.out.println("They are not anagrams");
            }

        }

    }

}
