package Exceptionhandling;
import java.util.*;

public class trywithresourceexceptionhandling {
    private static Scanner sc;

    public static void main(String[] args) throws Exception // this might throw an exception
     {
        try(Scanner sc = new Scanner(System.in)) /// in the try block only we can create the scanner object
        {
        String str =" ";
        str= sc.nextLine();// if this line throws an exception it will not execute sc.close();
        // for this we need to write it inside try and 
        }
        catch(Exception e){
            System.out.println(e);
        }
        
       finally {
            sc.close(); /// we don't need this block if we make inside try block
        }


        

        
    }
    
}
