import java.util.*;
public class Stringbuilder {
    public static void main(String args[]){
        StringBuilder sb= new StringBuilder("Allah Duhai Hae"); //// declaring sb whose data type is string builder
        System.out.println(sb);/// To print the thing inside the string sb

        System.out.println(sb.charAt(0)); /// to print a specific position in a string

        sb.setCharAt(0, 'Y');/// to change something anywhere in the string(position and the word to change)
        System.out.println(sb);

        sb.insert(4, 'e');/// to anything  insertt at postion
        System.out.println(sb);


        sb.delete(4,8); /// command to delete anything, by defining positions
        System.out.println(sb); 

        sb.append("k");
        System.out.println(sb); /// command to append something at the end of the string

        System.out.println(sb.length()); /// command to find the length of the string
        






    

    
        
    }
    
}