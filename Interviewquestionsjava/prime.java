package Interviewquestionsjava;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int num = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) {
            System.out.println(num + "The given number is a prime number");
        } else {
            System.out.println("not prime");
        }

    }

}
