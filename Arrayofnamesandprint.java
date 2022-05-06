import java.util.*;
public class Arrayofnamesandprint {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt(); // for defining the size of the string from the user
        String names[]= new String[size];

        for(int i=0;i<size;i++){
            names[i]=sc.next();        }

        
    }

    for(int i=0;i<names.length;i++){
        System.out.println("names" +(i+1) +" is :"+ names[i]);

    }
    
}
}
