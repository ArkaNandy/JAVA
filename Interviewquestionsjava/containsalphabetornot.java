package Interviewquestionsjava;

import java.util.Scanner;
/// does the string contain all the alphabets or not

public class containsalphabetornot {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input.toLowerCase();
        String input1 = input.replaceAll(" ", "");
        System.out.println(containsornot(input1));

    }

    private static boolean containsornot(String input1) {
        if (input1.length() < 26) {
            return false;
        } else
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (input1.indexOf(ch) < 0) {
                    return false;
                }
            }
        return true;
    }

}
