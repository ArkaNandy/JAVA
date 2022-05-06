
import java.util.*;
public class oddorevenusingifelse {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("odd");

        }

        else if(n%2==1){
            System.out.println("even");
        }

        else{
            System.out.println("NULL");

        }
        sc.close();
    }

    
}
