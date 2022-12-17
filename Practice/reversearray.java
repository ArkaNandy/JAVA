package Practice;
import java.util.*;
public class reversearray{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in); /// to take input from the user
        System.out.println("Enter the size of an array");
        int n= sc.nextInt(); /// enter the size of the array
        int array[] = new int[n];
        System.out.println("Enter the values in the array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt(); //// command to take value import
        }
        int temp; /// now we are reversing
        int start=0; // this will point to the start of the array
        int end =n-1;

        while(start<end){ /// 1, 2, 3, 4, 5 
            temp=array[start]; // so start will point to index 0 and end will point to index 4
            array[start]=array[end];
            array[end]=temp;
            start++; // we are incrementing the start position
            end--; // we are decrementing the end position 
            /// and we keep on comparing
            


        }

        System.out.println("Array after reversing");
        for(int j=0;j<n;j++){
            System.out.print(array[j] + " ");

        }



    }
}