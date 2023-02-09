package Interviewquestionsjava;

import java.util.Scanner;

public class recursioninfact {
    public static int fact(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (num * fact(num - 1));

        }

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int fact = sc.nextInt();
        System.out.println(fact(7));

    }

}
