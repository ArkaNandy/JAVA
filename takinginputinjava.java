import java.util.*;

public class takinginputinjava {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in); /// command to take input
        String name = sc.nextLine(); /// with the help of next function e are going to take input 

        /// nextInt()
        ///nextFloat()
        //nextDouble()
        System.out.println(name);
        sc.close();

    }
}