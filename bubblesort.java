import java.util.*;
public class bubblesort {

    public static void printArray(int array[]){ /// function to print the array
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }



    public static void main(String args[]){ /// time complexity O(n^2)

        int array[] ={7,8,3,2,1}; // the array we need to sort

        for( int i=0; i<array.length-1;i++){ /// the outer loop which will have (n-1) iterations
    
        
            for(int j=0; j<array.length-i-1;j++){ // the amount of element sorted is -1
                
                if(array[j]>array[j+1]){ /// we nedd to swap if this criteria matches

                    int temp= array[j]; // for sometime we store the value of array[i] in temporary variable
                    array[j] = array[j+1];
                    array[j+1] = temp; /// the postion will be defined by j


                }

            }
        }

        printArray(array); // calling the print array function in the main function


    }
    
}
