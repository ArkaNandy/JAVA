package Interviewquestionsjava;

import java.util.Scanner;

public class spaceremover2 {
    public static void main(String[] args) {
        System.out.println("Enter the string with spaces");
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        String noWhitespace="";
        for(int i=0;i<input.length();i++){
            if((input.charAt(i)!=' ')&& (input.charAt(i) != '\t')){
                noWhitespace = noWhitespace+input.charAt(i);
            }


        }

        System.out.println(noWhitespace);


        
        
    }
    
}
