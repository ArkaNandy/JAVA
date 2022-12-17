package Interviewquestionsjava;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int k=0;
        System.out.println("Enter any number");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        while(k<=n){
            k=a+b;
            System.out.println(k+" ");
            a=b;// after printing k the b becomes a
            b=k;

            /// 



        }

    }
    
}
