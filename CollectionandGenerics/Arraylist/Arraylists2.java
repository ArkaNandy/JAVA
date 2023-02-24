package CollectionandGenerics.Arraylist;

import java.util.ArrayList;
/// default capacity of arraylist=10
// we can have any type of arraylist until we mention the generics
// 

public class Arraylists2 {
    public static void main(String[] args) {
        ArrayList<Object> as1 = new ArrayList<Object>(); // here we are storing any kind of datatype
        as1.add(100);
        as1.add(200);
        as1.add("testing");
        as1.add('t');
        as1.add(12.33);
        as1.add(true);
        System.out.println(as1.get(5)); // to get the value
        System.out.println(as1.size()); // this will give the output of the size of the list
        as1.add("YO");
        as1.add(300);
        System.out.println(as1.size()); // this will give size 8 as we have added to more values which proves arraylist
                                        // is dynamic in nature

        ArrayList<Integer> marksl1 = new ArrayList<>();
        marksl1.add(15);// generic based here we can add only integer values
        marksl1.add(17);

        ArrayList<String> stl1 = new ArrayList<>();
        stl1.add("arka");
        stl1.add("Naveen");
        stl1.add("Moi");
        stl1.add("Sharma");
        stl1.add("Kuttaputti");

        for (int i = 0; i < stl1.size(); i++) { // for iterating
            System.out.println(stl1.get(i));

        }
        for (Object k : as1) { /// iterating the first list as1 with the help of for each loop

            System.out.println(k);
        }

        System.out.println(as1.size()); // to find the size of the arraylist

        System.out.println(stl1.size());
        System.out.println(marksl1.size());

    }

}
