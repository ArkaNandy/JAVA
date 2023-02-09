package Interviewquestionsjava;

import java.util.Arrays;
import java.util.Scanner;

public class usinginbuiltsortmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputarray= new int[5];
        System.out.println("Input the elements in the array");
        for(int i=0;i<inputarray.length;i++){
            inputarray[i]=sc.nextInt();
        }
        System.out.println(inputarray.length);
       // int [] sortedarray= Arrays.sort(inputarray);
        System.out.println(Arrays.sort(inputarray));

    }
    
}
