package BinarySearch;

public class agnosticBinarySearch {
    static int orderAgnosticBinarySearch(int arr[], int key){
        int start=0;
        int end = arr.length-1;
        int mid= start+(end-start)/2;


        boolean isAsc=(arr[start]<arr[end]); // checking if the array passed is sorted in ascending or descending order


        if(arr[mid]==key){
            return mid;

        }

        if(isAsc){
            if(key<arr[mid]){
                end=mid-1;
            }
            else if(key>arr[mid]){
                start=mid+1;

            }

        }
        else{
            if(key>arr[mid]){
                end=mid-1;
            }
            else if(key>arr[mid]){
                start=mid+1;

            }
        }
    

      






        return -1;

    }
    public static void main(String[] args) {
        int[] arr={1,7,9,11,37,45,57,99};
        int key= 57;
        System.out.println(orderAgnosticBinarySearch(arr, key));
        
    }
    
}
