package Javainterviewquestions2;

import java.util.Scanner;

public class countwordsfromacapitalizedstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int capitalcount = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                capitalcount++;
            }
        }
        System.out.println("Number of capital letters in the string " + capitalcount);
    }

}
