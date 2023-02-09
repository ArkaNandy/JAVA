package Interviewquestionsjava;

import java.util.Scanner;

public class swapwithout3rdvariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a= sc.nextInt();
        System.out.println("Enter the value of b");

        int b=sc.nextInt();
        System.out.println("a is:"+a+ " and b is:"+b );
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Now a is:"+a+ " and b is:"+b );
 
    }
    
}
