import java.util.*;
public class Arrayinputfromtheuser {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in); // to take inputs of the array elements
        int size =sc.nextInt();/// to take input of the array size
        int marks[]=new int[size];

        for(int i=0;i<size;i++){ //// for input from the user
            marks[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){ /// traversing the array and printing every elements
            System.out.println(marks[i]);

        }
        sc.close();




    }
    
}
