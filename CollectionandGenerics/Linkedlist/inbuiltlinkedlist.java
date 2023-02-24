package CollectionandGenerics.Linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class inbuiltlinkedlist {
    /// Linked list is a default class in java, and has inbuilt methods
    // we always don't need to implement it
    // It can be used as List,Stack,Queue as it implements all these interfaces
    // it allows null elements
    // dynamic spaces can be allocated
    // insertion and deletion can be easily implemented
    /// can contain duplicate elements
    // not thread safe
    // in linked list manipulation is fast, as there is no shifting present
    /// proper indexing available

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("Arka");
        names.add(null);
        names.add("Robbie");
        names.add(null);
        names.add("Zyndaee");

        System.out.println(names.size()); // getting the size of the linkedlist
        System.out.println(names); // just printinfg the linkedlist
        System.out.println(names.get(5)); // to get an element at an particular index

        //// Iterator<String> it = names.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        names.add(2, "Nafiza"); // this will shift the element present in the second position
        System.out.println(names); // so from here we see insertion in between nodes are very easy in linkedlist

        // }

        LinkedList<String> users = new LinkedList<>();
        users.add("Peter");
        users.add("Ram");
        names.addAll(users); // this method will add the linkedlist names with linkedlist users
        System.out.println(names);

        names.addFirst("Immana"); // to add any element at the first postion of the linkedlist
        names.addLast("Kamla");// to add any element at the last postion
        System.out.println(names);

        names.remove("Ram");
        System.out.println(names);// we can also remove strings from the slist by this method

        names.remove(4); // we can also remove by mentionoing an index
        System.out.println(names);

        names.removeFirst(); // method to remove element at the first
        names.removeLast(); // method to remove elements
        System.out.println(names);

        int length = names.size();

        for (int i = length - 1; i >= 0; i--) { //
            System.out.println(names.get(i));
        }

        for (String s : names) { // iterating the list using for each loop
            System.out.println(s);
        }

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(4);
        numbers.add(10);
        Collections.sort(numbers); // sorting a list
        int size = numbers.size();

        for (int i = size - 1; i >= 0; i--) {
            System.out.println(numbers.get(i)); // sorting the linkedlist in descending order
        }

    }

}
