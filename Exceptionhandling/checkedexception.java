package Exceptionhandling;
import java.util.Scanner;


import java.util.*;


public class checkedexception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=8;
        int j=0;
        int k;

        try{
         //   j=sc.nextInt();

            
            k=i/j;
            System.out.println(k);

            

        }
        catch(Exception e){
            System.out.println("Some IO Error");

        }
        System.out.println("Here the k can contain only an integer value so when we divide it by 0 it's undefined and we catch that exception and print it with some wrong input value");
        



    }
    
}
