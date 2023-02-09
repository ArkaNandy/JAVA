package Interviewquestionsjava;

import java.util.Scanner;

public class stringcontainsvowelsornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        input.toLowerCase();
        input.replaceAll(" ", "");
        System.out.println(input);
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u') {

                System.out.println("vowels are present");
            } else {
                System.out.println("No vowels are present in the string");
            }
        }
    }

}
