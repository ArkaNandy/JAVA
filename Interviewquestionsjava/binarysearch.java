package Interviewquestionsjava;

import java.util.Scanner;

public class binarysearch {
    
    public static void main(String[] args) {
       
        int array[]={10,22,37,56,59,66,72,77,89,94}; // in case of binary search the array needs to be sorted
        int key= 77;
        System.out.println(search(array,key));
        
    }

    private static int search(int[] array, int key) {
        int start= 0;
        int end = array.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(key<array[mid]){
                end=mid-1;
            }
            else if(key>array[mid]){
                start= mid+1;
            }
          
            else{
                return mid;
            }
        }
        return -1; // signifies

        
    }
    
}
