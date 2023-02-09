package Interviewquestionsjava;

import java.util.Scanner;

public class spaceremover {
    public static void main(String[] args) {
        System.out.println("Enter the string with spaces");
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();

        String removedspaces= input.replaceAll("\\s","");
        System.out.println(removedspaces);
    }
    
}
