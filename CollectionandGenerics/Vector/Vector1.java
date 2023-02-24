package CollectionandGenerics.Vector;

import java.util.Collections;
import java.util.Vector;

public class Vector1 {
    // Thread safe
    /// Sizing doubles in size when the capacity is reached
    // Type safety is there, ie supports generics
    // Ordering is present the way elements are inserted, they get printed out that
    // particular way

    public static void main(String[] args) {
        Vector<Integer> intlist = new Vector<>();
        intlist.add(2);
        intlist.add(6);
        intlist.add(13);
        intlist.add(4);
        intlist.add(17);
        intlist.add(19);

        System.out.println(intlist);

        Collections.sort(intlist);

        System.out.println(intlist);
        System.out.println(intlist.get(3));// would get the value at that particular index

        intlist.remove(2);
        System.out.println(intlist);

        Vector<Integer> intlist2 = new Vector<>();
        intlist2.add(5);
        intlist2.add(17);
        intlist2.add(19);

        intlist2.addAll(intlist); // this will append the first vector intlist with the second vector intlist2
        System.out.println(intlist2);

        // for (Integer e : intlist) { // using for each loop for iteration
        // System.out.println(intlist.get(e));
        // }

        Collections.sort(intlist2);
        System.out.println(intlist2);

        for (int i = intlist2.size(); i >= 0; i--) { // iterating the second list
            // backwards and printing it
            System.out.println(intlist2.get(i)); // basically printing it backwards
        }

    }

}
