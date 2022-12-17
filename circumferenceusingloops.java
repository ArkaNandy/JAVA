import java.util.*;
public class circumferenceusingloops {

public static Double calculateCircumference (float r){
        double radius=2*3.14*r;
        return radius;
    }
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
Double r= sc.nextDouble();
System.out.println (calculateCircumference(r));

    }
    
}
