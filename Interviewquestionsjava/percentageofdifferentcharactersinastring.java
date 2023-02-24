package Interviewquestionsjava;
///Find Percentage Of Uppercase Letters, Lowercase Letters, Digits And Special Characters In String?

/// example :- "Arka Nandy @ 123##0019"
// Uppercase characters:- 10%
// Lowercase characters :- 37%
//
//

import java.util.Scanner;

public class percentageofdifferentcharactersinastring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println("Enter your string");
        int stringlength = input.length();

        int uppercasecount = 0;
        int lowercasecount = 0;
        int specialcharactercount = 0;
        int digitscount = 0;
        int specialChars = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercasecount++;

            } else if (Character.isLowerCase(ch)) {
                lowercasecount++;
            }

            else if (Character.isDigit(ch)) {
                digitscount++;

            } else {
                specialChars++;

            }

            double uppercasepercentage = (uppercasecount * 100) / stringlength;
            System.out.println(uppercasepercentage);

            double lowercasepercentage = (lowercasecount * 100) / stringlength;
            System.out.println(lowercasepercentage);

            double digitspercentage = (digitscount * 100) / stringlength;
            System.out.println(digitspercentage);

            double specialCharspercentage = (specialcharactercount * 100) / stringlength;
            System.out.println(specialCharspercentage);

        }

    }

}
