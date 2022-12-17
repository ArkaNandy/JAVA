package Stackdatastructure;
import java.util.*;



public class inBuiltstack {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<Integer>();

         // In stack we should know that it follows LIFO(last in first out)
         // anything which gets appended to the last of the stack gets out first

        stack1.push(45); // here 45 is being pushed in first, it will definitely be the last one to get popped
        stack1.push(29);
        stack1.push(44);
        stack1.push(57);
        stack1.push(64); // here 64 is the last element to get pushed in so it will will be the first one to be popped


         System.out.println(stack1.pop());  // this first pop will get 64 as it is the last element to get pushed in the stack data structure     

       System.out.println(stack1.pop()); 
        System.out.println(stack1.pop());
       System.out.println(stack1.pop());
       System.out.println(stack1.pop());
       


        

    }
    
}
