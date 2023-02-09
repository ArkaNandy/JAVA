package Switchstatements;

import java.util.Scanner;

public class newswitch {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a day");
        String dayinput=sc.next();
        String result="";

        result= switch(dayinput)
        {
            case "Saturday", "Sunday" -> "6am";

            case "Monday" -> "8am";
            default -> "7am";
            
            

        };




    }
    
}
