import java.util.*;
public class strings {
    public static void main(String args[]){

    String name="Arka"; /// declaration of string
    String fulName= "Arka Nandy";
    String sentance= " What's up broo";
    String concatenation= fulName+sentance; // concatenation of two strings

    Scanner sc= new Scanner(System.in);
    String input = sc.nextLine();
    System.out.println("Your name is : "+ input);//// printing out a string given from the  user

    System.out.println(concatenation); 
    System.out.println(concatenation.length()); /// command t find out the length of a string

    for(int i=0;i<concatenation.length();i++){
        System.out.println(concatenation.charAt(i)); /// to print every element on the string




        String name1 ="Nigga"; // To compare  both the strings
        String name2 = "Begul"; 
         /// if S1>S2 :- +ve value
         // is S1=S2 :- 0
          // if S1<S2 :- -ve value

        if(name1.compareTo(name2)==0) // command to compare two strings
        {
            System.out.println("Strings are equal");
        
        }
        else{
            System.out.println("Strings are not equal");
        }

        String name3= name2.substring(2,name2.length()); /// fuction to print the substring
        System.out.println(name3);
        


    } //// strings are immutable
      /// once declared inside memory can't be changed , can't be delted added 


    }
    
}
