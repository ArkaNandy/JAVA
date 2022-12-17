package Sorting;

public class Selectionsort2 {
    class Selectionsort{

        void sort(int arr[]){
            for(int i=0;i<arr.length;i++){ // wea re iterating over the array
                int min_index=i; // we are setting min index as i
                for(int j=i+1;i<arr.length;j++){ /// we are iterating with one postion after so that we can compare
                    if(arr[j]<arr[i]) // we are comparing the first 1st
                    min_index=j;

                    int temp = j;
                    j= arr[i];
                    arr[i]=temp;
            }
        }
        }
        void printArray(int arr[]){
            for(int i=0; i<arr.length;i++)
            System.out.println(arr[i]+ " ");
        }
        
        
    }
    public static void main(String[] args) {
        Selectionsort s1= new Selectionsort();
        int arr[]={64,25,12,22,11};
        s1.sort(arr);
        System.out.println("Sorted array");
        s1.printArray(arr);
        
    }

    
}
