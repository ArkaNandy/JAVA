package Searchingalgorithms;



public class searchinRange { // what if we need to search in a particular range of a string
    static int linearSearchinrange(int[]arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int i = start;i<= end;i++){
            if(arr[i]== target){
                return i;

            }
        }
        return -1;


    }
    public static void main(String[] args) {
        int arr[]={18,12,-7,3,14,28};
        int target = -7;
        
        System.out.println(linearSearchinrange(arr, target, 1, 4));
        
    }

    
}
