package CollectionandGenerics.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
  public static void main(String[] args) {

    /// Arraylist stores objects, ie if we want to store integer number we have to
    /// use integer class
    ArrayList<Integer> list1 = new ArrayList<>(); // Array list of integer type objects
    // ArrayList<Float> list2 =new ArrayList<>(); // we creating the object of the
    // Arraylist
    /// ArrayList<String> list3= new ArrayList<>();
    // ArrayList<Boolean> list4= new ArrayList<>();
    list1.add(0); // adding elements to the list
    list1.add(2);
    list1.add(3);
    System.out.println(list1);

    /// getting elements of the list

    int element = list1.get(0); //// inside get() we need to put the index of the arraylist we want amd store it
                                //// inside an integer
    int element2 = list1.get(2);
    System.out.println(element);
    System.out.println(element2);

    //// adding elements in between the list
    list1.add(1, 1);// putting the index then puttng what value we need to put in the index
    System.out.println(list1);

    //// set element(changing a particular element already present in the list)
    list1.set(0, 5); // (the postion of the element we want to change, the value we want to change it
                     // with)
    System.out.println(list1);

    //// delete elements from a list
    list1.remove(3); /// the postion of the element we need to remove
    System.out.println(list1);

    /// to get the size of the array list
    int size = list1.size(); // size function
    System.out.println(size);

    for (int i = 0; i < list1.size(); i++) {
      System.out.println(list1.get(i)); // i is the the index of the arraylist which needs to get accessed

    }
    System.out.println();

    /// sorting ,Inside java we can automatically sort elements by just using a
    /// function

    Collections.sort(list1);
    System.out.println(list1);

  }
}
