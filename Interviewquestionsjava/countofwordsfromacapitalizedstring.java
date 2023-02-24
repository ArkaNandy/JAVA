package Interviewquestionsjava;

import java.util.Scanner;

// Count the capital words from a string
public class countofwordsfromacapitalizedstring {
    /// Example: Hi Arka Naveen This side wordcount=4

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Enter the desired string");
        int wordcount = 0; // initialising te wordcount with 0
        for (int i = 0; i < input.length(); i++) { // iterating the string
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') { //
                wordcount++;
            }
        }
        System.out.println(wordcount);

    }
}
