//We can perform various operation on String in java. The following are the operations:
//Length():use to can find length of string.
//Concat():use to concat two strings.
//Split():use to split a string.
//Replace:use to replace a string.
//Substring:let you select a part of string.

package Interviewquestionsjava;

import java.util.Scanner;

public class Stringoperationsproblems {
    public static void main(String[] args) {
        String s1;
        String s2;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the two strings");
        s1= sc.nextLine();
        s2=sc.nextLine();
        String s3= s1+s2;// the way to concate two strings
        System.out.println("The concated result of the two strings are : "+s3);


        int length1=s1.length();
        int length2= s2.length();//Length():use to can find length of string.
        System.out.println("Length of the first string :"+length1);
        System.out.println("Length of the second string :"+length2);


        s1= s1.toUpperCase();
        s2= s2.toUpperCase();

       
        System.out.println("The first string to Uppercase is : "+s1);
        System.out.println("The second string to Uppercase is : "+s2);


        s1= s1.toLowerCase();
        s2= s2.toLowerCase();
        System.out.println("The first string to Lowercase is : "+s1);
        System.out.println("The second string to Uppercase is : "+s2);





    
        

    }
    
}
