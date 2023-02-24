package Interviewquestionsjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class removeduplicateelementsusinglinkedhashset {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 22, 3, 1, 4, 5, 6, 1, 7, 8, 9, 7));

        LinkedHashSet<Integer> intlist = new LinkedHashSet<>(numbers);

        ArrayList<Integer> listwithoutduplicates = new ArrayList<>(intlist);
        // System.out.println(listwithoutduplicates);
        System.out.println(intlist);

    }

}
