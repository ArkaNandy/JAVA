import java.util.*;

public class printingnameusingfunction{
    public static void printMyName(String name){
        System.out.println(name); /// printing the thing written inside scanner class
        return;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); // to take input of the string
        String name=sc.next();

        printMyName(name); ///calling the function



    }

}