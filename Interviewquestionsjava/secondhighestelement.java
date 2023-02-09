package Interviewquestionsjava;

import java.util.Arrays;
import java.util.Scanner;

public class secondhighestelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int[]a1= new int[n];
        System.out.println("Enter elements of the array");
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        Arrays.sort(a1);
        System.out.println("The 2nd highest element ="+ a1[a1.length-2]);
        System.out.println("the second smallest number in the array ="+a1[1]);
    }
    
}
