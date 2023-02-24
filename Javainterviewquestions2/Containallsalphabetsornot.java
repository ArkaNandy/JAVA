package Javainterviewquestions2;

import java.util.Scanner;

public class Containallsalphabetsornot {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String input1 = input.toLowerCase().replaceAll(" ", "");
        System.out.println(containsornot(input1));
        sc.close();

    }

    public static boolean containsornot(String input1) {
        if (input1.length() < 26) {
            return false; // as total alphabets in the english dictionary contains 26
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (input1.indexOf(ch) < 0) {
                return false;

            }
        }

        return true;

    }

}
