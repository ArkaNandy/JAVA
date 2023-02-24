package CollectionandGenerics.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistmethods {
    public static void main(String[] args) {
        ArrayList<String> ar1 = new ArrayList<>();
        ar1.add("java");
        ar1.add("python");
        ar1.add("ruby");
        ar1.add("javascript");

        ArrayList<String> ar2 = new ArrayList<>();
        ar2.add("Testing");
        ar2.add("Dev ops");

        // ar1.addAll(ar2); // method to combine two arraylists
        System.out.println(ar1);

        ar1.addAll(2, ar2); // this will also combine both the arraylists but from the 2nd index of ar1 they
                            // will append the elements of ar2

        System.out.println(ar1);

        // ar1.clear(); // method to clear out the arraylist
        System.out.println(ar1);
        ArrayList<String> cloneList = (ArrayList<String>) ar2.clone();
        System.out.println(cloneList);

        System.out.println(ar1.contains("java")); // method to check if it contains that particular element

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("NAveen");
        list1.add("Tom");
        list1.add("Steve");
        list1.add("Lisa");
        list1.add("Arka");
        list1.add("Moitu ");
        System.out.println(list1.indexOf("Lisa")); // this method returns the index of a particular element
        System.out.println(list1.remove(1)); // method removes which removes the element at the particular element
        System.out.println(list1.remove("Arka")); // this method directly removes the element
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(6);
        list2.add(7);
        list2.add(19);
        // list2.removeIf(num -> num%2==0
        ;
        System.out.println(list2);

        ArrayList<String> stringlist2 = new ArrayList<>();
        stringlist2.add("Zara");
        stringlist2.add("Yejhaa");
        stringlist2.add("Setupathi");
        stringlist2.add("jenga");
        stringlist2.add("Tengaa");
        stringlist2.add("Tengaa");

        System.out.println(stringlist2);

        stringlist2.retainAll(Collections.singleton("Tengaa"));
        System.out.println(stringlist2);

        ArrayList<Integer> numlist2 = new ArrayList<>();
        numlist2.add(11);
        numlist2.add(17);
        numlist2.add(13);
        numlist2.add(12);
        numlist2.add(10);
        numlist2.add(1);
        numlist2.add(16);
        numlist2.add(18);

        ArrayList<Integer> sublist = new ArrayList<>(numlist2.subList(3, 7)); // method to create sub list from a
                                                                              // particular list

        System.out.println(sublist);

        Object arr1[] = numlist2.toArray(); // method to convert arraylist to array
        System.out.println(arr1);

    }

}
