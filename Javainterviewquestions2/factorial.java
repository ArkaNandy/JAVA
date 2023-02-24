package Javainterviewquestions2;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = sc.nextInt();
        int fact = 1;

        if (input == 0) {
            System.out.println("factorial is" + 1);
        } else {
            for (int i = 1; i <= input; i++) {
                fact = fact * i;
                System.out.println("Factorial is" + fact);

            }
        }

    }

}
