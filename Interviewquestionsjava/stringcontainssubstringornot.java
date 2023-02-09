package Interviewquestionsjava;

import java.util.Scanner;

public class stringcontainssubstringornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1"); // Accepting string 1 from the user
        String str1 = sc.nextLine();
        System.out.println("Enter string 2"); /// Accepting string 2 from the user
        String str2 = sc.nextLine();
        System.out.println(str1.contains(str2)); /// does the second string has some similar contents like string 1

    }

}
