package Interviewquestionsjava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeduplicates {

    public static void main(String[] args) {

        String array1[] = { "a", "b", "c", "a", "d", "e", "d" }; /// here we see an array with many duplicates, we want
                                                                 /// to remove them
        int array2[] = { 1, 5, 7, 6, 9, 8, 9, 5, 7 };
        String s1 = "1, 2,3, 4, 5";
        Set<String> set1 = new HashSet<>(Arrays.asList(array1)); // we are coverting the array to a set as we know set
                                                                 // does
        /// not support redundant data the moment we convert the array to a list all the
        /// redundant dadta will be removed
        // Set<Integer> set2 = new HashSet<>(Arrays.asList(array2));
        // Set<Integer> set2= new HashSet<>(Arrays.asList(array1));

        System.out.println("Set: " + set1);
        // System.out.println("Set: " + set2);

    }
}
