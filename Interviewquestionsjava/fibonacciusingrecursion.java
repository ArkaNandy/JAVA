package Interviewquestionsjava;

import java.util.Scanner;

public class fibonacciusingrecursion {
    public static void main(String[] args) {
        System.out.println("Enter ehich fib number you want in a series");
        Scanner sc= new Scanner(System.in);
        long n=sc.nextInt();
        System.out.println(fibonacci(n));

           
        }

        private static long fibonacci(long n){
            if(n<=1){/// base case in recursion
                return n;
            }
            return (fibonacci(n-1)+fibonacci(n-2));
        }
        
    }
    

