import java.util.*;
public class maxmininarray {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();//// taking the size of the array from the user
        int numbers[]=new int[size]; // defining the array, 

        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();

        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min =numbers[i];   
            }
            if(numbers[i]>max){
                max=numbers[i];
            }

           
        }

        System.out.println("largest number is : "+max);
            System.out.println("Smallest number is: "+min);

    }
    
}
