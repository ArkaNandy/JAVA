package CollectionandGenerics;

import java.util.Set;
import java.util.TreeSet; // package for tree interface


public class treeSet{
    public static void main(String[] args) {
        Set<Integer> values = new TreeSet<>();// we are using TreeSet because in Hashset the values in the set interface gets printed in a random sequence
        // but atleast we can print the values in ascending order if we use treeSet
        values.add(5);
        values.add(6);
        values.add(9);
        values.add(6);// this won't get printed, because it's a redundant data in the list
        values.add(345);
        values.add(456);
        values.add(988);
        for(int i:values){ // 
            System.out.println((i));
        } /// So what's the differnce between list and set if they are doing the same stuff?
        // the main differnce between set and list is that set does not entertain redundant data


    } 


    
    
}
