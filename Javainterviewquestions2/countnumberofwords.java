package Javainterviewquestions2;

import java.util.Scanner;

public class countnumberofwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Number of words in the string: " + count);

    }

}
