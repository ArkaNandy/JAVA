package Interviewquestionsjava;

import java.util.Scanner;


public class returnthenewelement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string 1");
        String input1= sc.nextLine();
        System.out.println("Enter the second string");
        String input2= sc.nextLine();
        input1.toLowerCase();
        input2.toLowerCase();

        System.out.println(stringCompare(input1, input2));


        
    }

    private static char stringCompare(String input1, String input2) {
        if(input1.length()==input2.length()){
            System.out.println("both the strings are same");
        }
        else{
           for(int i=0;i<input1.length();i++){
            if(input1.charAt(i)!= input2.charAt(i)){
                return(input2.charAt(i));
            }
           }
        }
        return 0;
        

        
    }
    
    
}
