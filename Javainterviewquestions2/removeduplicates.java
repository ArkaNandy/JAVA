package Javainterviewquestions2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicates {
    public static void main(String[] args) {
        String arr[] = { "java", "c++", "hi nigga", "nigga", "c++", "java", "d" };
        Set<String> hs1 = new HashSet<>(Arrays.asList(arr));
        System.out.println("The list without duplicates :" + hs1);
    }

}
