package Searchingalgorithms;
import java.util.*;

public class linearsearch {
  static int linearSearch(int[]arr,int target){ // function to iterate over the array and search of the 
        if(arr.length==0){ // if the array size is 0 it will return -1
            return -1;

        }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if (arr[i]==target){ // if the element is found
                return i; // it will return the index,where it is found
                // return target; if you want to return the value it self
            }

        }
        return -1; // if the element is not found it will return -1
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr={23,45,1,2,8,19,-3,16,-11};
        int target=19;
        int ans= linearSearch(arr,target);
        System.out.println(ans);
        
    }

    
}
