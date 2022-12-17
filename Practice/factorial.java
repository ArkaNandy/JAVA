import java.util.*;
package Practice;

public class factorial {
    public static void main(String[] args) {
        int n=6;
        int fact=1;// with which we will kwwp on multiplying
        System.out.println("Enter any number");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial of the number is " + fact);

    }
    
}
