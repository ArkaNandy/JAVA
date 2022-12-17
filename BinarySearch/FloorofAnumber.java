package BinarySearch;

public class FloorofAnumber { // biggest element in array smaller or equal to target is called ceiling of a number
    static int Binarysearch(int arr[], int key){
        int start =0;
        int end= arr.length-1;
        while(start<=end){
           // int mid= (start+end)/2; // if start and mid ar very large values they might fail to get stored in integer
            int mid= start+(end-start)/2;

            if(key<arr[mid]){ // if the key we want to find is situated in the left of the mid element in the  array
             end=mid-1;
            }
            else if(key>arr[mid]){ // if the key we want lies in the right hand side of the middle element
                start=mid+1;
            }
            else{ // if the middle element is the key
                return mid;
            }
        }
        return end; // if key not found

    }






    public static void main(String[] args) {
        int[] arr={1,7,9,11,37,45,57,99};
        int key= 57;
        System.out.println(Binarysearch(arr, key));
        
    }
    
}
