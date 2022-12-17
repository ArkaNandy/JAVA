package Searchingalgorithms;


public class minimumnumberusingLinearsearch {
    static int findminimum(int[] arr){
        int ans= arr[0]; // let's assume the 0'th index is the answer we want 
        for(int i=1;i<arr.length;i++){ // after iterating over the array
            if(arr[i]<ans){ // if the i is less than the ans
                ans=arr[i];
            }
        }
        return ans;

    

    }
    public static void main(String[] args) {
        int arr[]={18,12,-7,3,14,28};
        System.out.println(findminimum(arr));
    
        
    }
    
}
