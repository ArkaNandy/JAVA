package Interviewquestionsjava;

import java.util.Scanner;

public class revereseaninteger2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String str = Integer.toString(a); // here we are converting the input into a string
        String rev = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) { // then we are reversing the string
            rev = rev + str.charAt(i); // appending the element to it
        }
        System.out.println(rev);
        System.out.println(str.compareTo(rev));

    }

}
