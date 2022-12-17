package Exceptionhandling;
import java.util.*;

public class Exceptionhandling { // we can handle the problem with try and catch problem
    public static void main(String[] args) {
        try {
            int myInt=Integer.parseInt("pants"); // parse int takes a string of number and coverts into an integer number
            /// but over here it's gonna throw an exception because it's a string of characters
            // we can catch the exception that is thrown and control code to handle the situation elegantly
        } 
        catch(NumberFormatException nfe){ // catch block will get executed only when the try block shows an exception
            System.out.println("Hey dude you can't make an integer out of the word pants stop trying to do that");
         // 
        }
        
    }

}

