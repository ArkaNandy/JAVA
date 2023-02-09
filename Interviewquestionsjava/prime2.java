package Interviewquestionsjava;

import java.util.Scanner;

public class prime2 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0 || n == 1) {
            System.out.println("is not prime");
        }
        if (n == 2) {
            System.out.println("Is prime");
        }

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                System.out.println("Not prime");
            } else {
                System.out.println("prime");
            }

        }

    }

}
