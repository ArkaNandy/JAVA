package Interviewquestionsjava;

import java.util.Arrays;
import java.util.Scanner;



public class ifwoarrayscontainthesameelement {
    public static void main(String[] args) {
        int[] array1= {3,6,7,9,12};
        int[] array2={11,9,3,7,6};
        Arrays.sort(array1);
        Arrays.sort(array2);

        boolean decision = Arrays.equals(array1, array2);

        if(decision==true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal ");
        }

    
        
    }

    


    
    


    
}
