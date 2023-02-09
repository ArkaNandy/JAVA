package Interviewquestionsjava;

import java.util.Scanner;

public class ifcontainsvowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input srting string");
        String input = sc.next();
        System.out.println("Enter a vowel");
        int vowel = 0;
        char c = sc.next().charAt(0);
        for (int i = 0; i < input.length(); i++) {
            if (c == input.charAt(i)) {
                System.out.println("Vowel present");
                vowel++;
            } else {
                System.out.println("no vowels present");
            }
        }

    }

}
