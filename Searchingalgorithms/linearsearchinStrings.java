package Searchingalgorithms;

import java.util.Arrays;

public class linearsearchinStrings {
    static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(char ch :str.toCharArray() ){ // cpnverting the string into character array
            if(ch== target){
                return true;

            }
        }
        return false;

    }



    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target== str.charAt(i)){ // to get the value of any index of the string we an use the charAt method
                return true;

            }

        }
        return false;

    }
    public static void main(String[] args) {
        String name= "Arka";
        char target='r';
      //  System.out.println(search(name,target));
      System.out.println(Arrays.toString(name.toCharArray()));

        
    }
    
}
