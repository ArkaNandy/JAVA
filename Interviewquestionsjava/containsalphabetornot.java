package Interviewquestionsjava;

import java.util.Scanner;

public class containsalphabetornot {
public static void main(String[] args) {
    System.out.println("Enter the string");
    Scanner sc= new Scanner(System.in);
    String input = sc.nextLine();
    input.toLowerCase();
    System.out.println(containsornot(input));


 
    }

private static boolean containsornot(String input) {
    if(input.length()<26){
        return false;
    }
    else
    for(char ch= 'a';ch<='z';ch++){
        if(input.indexOf(ch)<0){
            return false;
        }
    }
    return true;
}

    
}

