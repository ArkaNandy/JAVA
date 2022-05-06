import  java.util.*; // a package to use the scanner class
public class ifelse {
    public static void main(String args[] ){
        Scanner sc= new Scanner(System.in); /// we'll give input so to take input we use this
        int age = sc.nextInt(); // age will be given input by the user and the compiler will tell whether it is above 18
        if(age>18){
            System.out.println("Adult bitch");

        }

        else{
            System.out.println("Not an adult");
        }
    } // we have made scanner class's object
}