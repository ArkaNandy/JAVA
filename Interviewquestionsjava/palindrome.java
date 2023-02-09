package Interviewquestionsjava;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
       
        System.out.println("Enter any text or number");
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(isPalindrome( input));


        }

        static String isPalindrome(String input){
            String result="IS palindrome";
            int length=input.length();

            for(int i=0;i<length/2;i++){
                if(input.charAt(i)!= input.charAt(length-i-1)){
                    result="Not palindrome";
                }

            }
            return result;

            
        }

    }
    

