package Javainterviewquestions2;

import java.util.HashSet;

public class duplicateelementsinthearrayusinghashset {
    public static void main(String[] args) {
        String arr[] = { "java", "c++", "python", "java", "c++" };
        HashSet<String> hs1 = new HashSet<>();
        for (String s : arr) { // we will be iterating the array and add to the set
            if (hs1.add(s) == false) { /// the moment we see something already existing in the set if will return false
                System.out.println("Duplicate element found :" + s); /// it means it's a duplicate
            }
        }
    }

}
