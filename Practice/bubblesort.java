package Practice;


public class bubblesort {
    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+ " ");
        }
    }


    public static void main(String[] args) {
        int array[]={7,8,3,1,2};

        for(int i=0; i<array.length-1;i++){
            for(int j=0; j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp= array[j];
                    array[j]=array[j+1];
                    array[j+1]= temp;

                }

            }
        }
        printArray(array);

        
    }
    
}
