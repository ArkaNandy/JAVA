package Practice;

public class swarik {
    static void reverseArray(int array[],int start,int end){
        int temp;
        while(start<end){
            temp= array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }






    static void printarray(int array[],int size){
        for(int i=0; i<array.length;i++)
        System.out.println(array[i]+ " ");
        System.out.println();
        
    }

    public static void main(String[] args) {
        int array[]={1,2,3,4};
        printarray(array,6);
        reverseArray(array,0,5);
        System.out.println("reversed array is ");
        reverseArray(array,0,5);

        





        
    }

    
    
}
