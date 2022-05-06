public class selectionsort {

    public static void printArray(int array[]){
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int array[]={7,8,3,6,1}; /// THE ARRAY we need to sort
        for(int i=0;i<array.length-1; i++){ /// iterating till length-1
            int smallest= i; // index for smallest element
            for(int j=i+1; j<array.length;j++){ /// we start the loop from the next element of the smallest index
                if(array[smallest]>array[j]){ /// if the smallest is greater than the next one
                    smallest=j; //// then we make that element array[j] as the smallest 

                }
            }

            int temp= array[smallest]; /// now we swap i with the smallest
            array[smallest]=array[i];
            array[i]=temp;

        }
        printArray(array);
    }
    
}
