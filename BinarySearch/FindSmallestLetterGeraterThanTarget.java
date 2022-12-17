package BinarySearch;





public class FindSmallestLetterGeraterThanTarget{
    class Solution{
        public static char nextGreateblmdmstLetter(char[] letters, char target){
            int start=0;
            int end = letters.length-1;
    
            while(start<=end){
                int mid= start + (end-start)/2;
                if(target<letters[mid]){
                    end= mid-1;
    
                }
                else{
                    start=mid+1;
    
                }
    
            }
            return letters[start%letters.length];
        }


    public static void main(String[] args) {
        char []letters ={'h','f','d','g'};
        char target='d';
        System.out.println(nextGreatestLetter(letters,target));
        
    }

    fs;lbmds;blmdsb'l
}
}
