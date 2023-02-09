package Interviewquestionsjava;

import java.util.LinkedList;


public class reverselinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer>ll1=new LinkedList<>();

        ll1.add(5);
        ll1.add(7);
        ll1.add(9);
        System.out.println(ll1);

        LinkedList<Integer> ll2=new LinkedList<>();
        ll1.descendingIterator().forEachRemaining(null);
    }
    
}
