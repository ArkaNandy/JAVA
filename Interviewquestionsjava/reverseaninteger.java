package Interviewquestionsjava;

import java.util.Scanner;

public class reverseaninteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ineger to be reversed");
        int input = sc.nextInt(0);
        String s = Integer.toString(input);
        String rev = " ";
        int length = s.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

    }

}
