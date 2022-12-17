package Exceptionhandling;
import java.util.Scanner;



public class finallyexceptionhandling {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        int i=8;
        int j=0;
        int k;

        try{
           // j= sc.nextInt();

            
            k=i/j;
            System.out.println(k);

            

        }
        catch(Exception e){
            System.out.println("Some IO Error");

        }
        finally{ // when we want to print or execute something no matter if it throws an exception or not
            System.out.println("bye nig"); // one might think this can be printed anywhere, but this calls for redundant lines
            

        }



    }
    
}


    

