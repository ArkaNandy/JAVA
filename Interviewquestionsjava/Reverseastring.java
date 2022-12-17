package Interviewquestionsjava;

import java.util.Scanner;



public class Reverseastring {

    public static void main(String[] args) {
     String original;
     String reversed=" ";
     System.out.println("Enter the string to be reversed");
     Scanner sc= new Scanner(System.in);

     original= sc.nextLine(); // what the user will giye will get stored inside string original

     int length= original.length(); // in length variable we are storing the length of the user given string

     for(int i= length-1; i>=0;i--){
        reversed= reversed+ original.charAt(i);
     }
        System.out.println("Original string is: "+original);
        System.out.println("Reverse of string is:"+ reversed);

     
    




    

        
    }
    
}
