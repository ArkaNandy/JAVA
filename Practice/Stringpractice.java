
package Practice; ////
import java.util.*;
//  input a string
// 
// reverse the string
public class Stringpractice{ ///
    public static void main(String[] args) {
        String st = new String();
        Scanner sc = new Scanner(System.in);
        st=sc.nextLine();
        for(int i=st.length()-1;i>=0;i--){
            System.out.print(st.charAt(i));
        
        }
        StringBuilder rev= new StringBuilder(st);
        
    
        
    }

}