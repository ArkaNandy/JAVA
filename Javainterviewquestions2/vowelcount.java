package Javainterviewquestions2;

import java.util.Scanner;

public class vowelcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        input.toLowerCase();

        int vowelcount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u')

            {
                vowelcount++;
            }

        }
        System.out.println("The number of vowels in the given string is:" + vowelcount);

    }

}
