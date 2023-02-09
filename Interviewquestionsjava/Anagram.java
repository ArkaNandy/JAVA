package Interviewquestionsjava;

import java.util.Arrays;
import java.util.Scanner;

/// Are the two strings anagram or not, Anagrams are words which when are rearranged makes another meaningful word
/// example: CAT ACT /// LISTEN can also be rearranged and written as SILENT
/// Here's a code which shows whether two strings are anagram or not

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String input1 = sc.nextLine(); // we are taking in string 1

        System.out.println("Enter the second string");
        String input2 = sc.nextLine(); // we are taking in string 2

        String s1 = input1.replaceAll(" ", "").toLowerCase(); /// we are replacing all the spaces with no space and also
                                                              /// converting the string 1 to lowercase and storing it
                                                              /// inside s1 String
        String s2 = input2.replaceAll(" ", "").toLowerCase(); /// we are replacing all the spaces with no space and also
                                                              /// converting the string 2 to lowercase and storing it
                                                              /// inside s2 String

        if (s1.length() != s2.length()) { /// now after removing all the white spaces we are comparing the length of
                                          /// string s1 with s2
            System.out.println("This is not an anagram cause their lengths don't match"); // if they don't match then
                                                                                          // there's no question of it
                                                                                          // being an ananagram
        } else {
            char c1[] = s1.toCharArray(); /// we converting the string s1 to character array and storing it inside
                                          /// character array c1[]
            char c2[] = s2.toCharArray(); /// we converting the string s2 to character array and storing it inside
                                          /// character array c2[]
            Arrays.sort(c1); /// Sorting character array c1
            Arrays.sort(c2); // /// Sorting character array c2
            if (Arrays.equals(c1, c2)) { /// if they are equal
                System.out.println("This is an anagram");
            } else
                System.out.println("This is not an anagram ");

        }

    }

}
