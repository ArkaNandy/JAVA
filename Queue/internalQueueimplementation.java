package Queue;
import java.util.*;


public class internalQueueimplementation {
    public static void main(String[] args) {
    
        Queue<Integer>queue1= new LinkedList<>();
        // Queue follows FIFO rule(first in first out)
        queue1.add(5); // first element to be inserted will be the first element to get popped out
        queue1.add(7);
        queue1.add(8);
        queue1.add(9);
        queue1.add(6);
        queue1.add(1);


        System.out.println(queue1.peek()); // the first one inserted will be shown
        System.out.println(queue1.remove()); // the first element to be pushed will be popped
        



        

    }
    
    
}
