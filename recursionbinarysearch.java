public class recursionbinarysearch {
    public static void main(String[] args){
        int array[]={2,5,6,8,9};
        int target=8;
        System.out.println(binarysearch(array,target,0,4));

    }

    public static int binarysearch(int array[], int target,int start, int end){
        if(start>end){
            return-1;
        }
        int mid=start+(end-start)/2; 
        if(array[mid]==target){
            return mid;
        }

        if(target<array[mid]){ /// if target is in the left side of the array now the end element will be mid-1

           return binarysearch(array,target,start,mid-1); // always remember to return the value of any function
            
        }
        if(target>array[mid]){
            return binarysearch(array,target,mid+1,end);
        }


        



    }
    


    
    
}
