package Practice;
import java.util.*;

public class prime {
    public static void main(String[] args){
        int n=674836073;
        for(int i=2; i<=Math.sqrt(n);i++){ /// math.sqrt finds out the square root of any number
            if(n%i==0){
                System.out.println("not prime");
                return;
            }
        }

        System.out.println("prime");
        
}
}
