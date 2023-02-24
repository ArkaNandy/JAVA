package CollectionandGenerics.Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/// this program contains how to compare two hashmaps
// we can compare in key value format
// we can compare key to key
/// we can compare value to value

public class Comparetwohashmaps {
    public static void main(String[] args) {
        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(1, "A");
        hm1.put(2, "B");
        hm1.put(3, "C");

        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2.put(3, "C");
        hm2.put(1, "A");
        hm2.put(2, "B");

        HashMap<Integer, String> hm3 = new HashMap<>();

        hm3.put(3, "C");
        hm3.put(1, "A");
        hm3.put(2, "B");
        hm3.put(4, "D");

        /// 1st comparision on the basis of Key-value equals method

        System.out.println(hm1.equals(hm2));// will return true if both the maps contain the same values
        System.out.println(hm1.equals(hm3));// will return false if both contain different values

        //// 2nd comparison HashMaps for the same keys :keySet():
        System.out.println(hm1.keySet().equals(hm2.keySet())); // comapring just the key sets of hashmap 1 and hashmap2
        System.out.println(hm2.keySet().equals(hm3.keySet()));

        //// finding out the extra key
        HashSet<Integer> combineKeys = new HashSet<>();
        combineKeys.addAll(hm3.keySet()); // adding the keyset of hm
        combineKeys.addAll(hm2.keySet()); // adding the keyset of hm2, knowing set will only accept anything other than redundant data
        combineKeys.removeAll(hm2.keySet()); // then removing the keyset of hm2
        System.out.println(combineKeys); //only the extra keys will be left

        ///are duplicate values present in a hashmap? chcecking the values

        System.out.println(new ArrayList<>(hm3.values()).equals((new)));
        








    }

}
