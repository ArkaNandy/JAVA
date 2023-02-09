package Interviewquestionsjava;

import java.util.Scanner;

public class swaptwostringswithoutthirdvariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string a");
        String a = sc.nextLine();
        System.out.println("enter string b");
        String b = sc.nextLine();

        a = a + b;
        b = a.substring(0, a.length() - b.length());

        a = a.substring(b.length());
        System.out.println("value of a is : " + a);
        System.out.println("value of b is : " + b);

    }

}
