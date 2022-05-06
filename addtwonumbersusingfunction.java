import java.util.*;
public class addtwonumbersusingfunction {

    public static int calculateSum(int a, int b){ /// user defined function 
        int sum =a+b;
        return sum; // this is to store the value of calculateSum

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        int sum=calculateSum(a,b); /// sum variable for main function which is storing the value from calculateSum function
        System.out.println("Sumof the above two numbers is : " +sum);

    }
    
}
