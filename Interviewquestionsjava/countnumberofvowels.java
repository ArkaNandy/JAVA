package Interviewquestionsjava;

import java.util.Scanner;

public class countnumberofvowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the desired string");
        String input = sc.nextLine(); // we are storing the desired input from the user inside String input
        input.toLowerCase(); // then we are converting that string to lowercase
        int vowelcount = 0; // we are keeping a count and initialising it with zero

        for (int i = 0; i < input.length(); i++) { /// we are iterating the string
            if ((input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u')) { /// if any of the character value in any particular index matches with
                                                  /// the vowels we increment the vowel count
                vowelcount++; // incrementing the vowel count
            }
        }
        System.out.println(vowelcount); // then printinng the vowel count

    }

}
