package CollectionandGenerics.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetconcepts {
    // Set does not entertain redundant data
    /// ordering is not present, values are printed in random order
    // accepts null values
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Ayan");
        set1.add("Homiess");
        set1.add("Hoesxii");
        set1.add("Zendainnaa");
        set1.add("Lucifer");
        set1.add("Homies"); // this won't be printed as it is a set and does not entertain redundant data
        set1.add(null);/// does accept null values

        System.out.println(set1);
        for (String s : set1) {
            System.out.println(s);
        }
        System.out.println(set1.contains("Ayan")); // it will return true or falseee
        set1.remove("Lucifer");
        System.out.println(set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(7);
        set2.add(8);

        Set<Integer> set3 = new HashSet<>();
        set3.add(27);
        set3.add(3);
        set3.add(7);
        set3.add(82);

        Set<Integer> union = new HashSet<>(set2); // to get the union between two sets
        union.addAll(set3);
        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(set2); //
        intersection.retainAll(set2);
        System.out.println(intersection);

        Set<Integer> difference = new HashSet<>();
        difference.removeAll(difference);
        System.out.println(difference);

    }

}
