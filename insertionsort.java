public class insertionsort {
    public static void printArray(int array[]){
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]+ " ");

        }
        System.out.println();

    }
     public static void main(String args[]){
         int array[]={7,8,3,1,2}; { /// sort this array using insertion sort

            for(int i=0; i<array.length;i++){
                int current = array[i]; /// the current element in the array which is being checked and will be kept in the correct position
                int j= i-1;  //// taking another value which will start from the next elemet in the sorted part
                while (j>=0 && current<array[j]) // this whle loop will run till value of j is greater than zero and current less than j
                {
                    array[j+1] = array[j]; // elements getting pushed forward 
                    j--;
                }

                array[j+1]= current; // when the condition gets dissatisfied

            }

            printArray(array);
         }
     }

}
    