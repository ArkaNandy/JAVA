package Queue;
import java.util.*;

import Varags.varagsdemo;

public class Dequeue {  // doubly ended queue
    public static void main(String[] args) {
        Deque<Integer>deque1=new ArrayDeque<>(); 
        // deque interface extends class ArrayDequeue

        
        deque1.add(7);
        deque1.add(55);
        deque1.add(89);
        deque1.add(34);

        
        deque1.addLast(78); // add element at last
        deque1.addLast(77);
        deque1.addFirst(17); // add elemt at the first

        System.out.println(deque1.peek());
        
    }
    
}
