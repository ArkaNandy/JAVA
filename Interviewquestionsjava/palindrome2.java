package Interviewquestionsjava;

import java.util.Scanner;

public class palindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String input = Integer.toString(n);
        String rev = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            rev = rev + input.charAt(i);
        }
    }

}
