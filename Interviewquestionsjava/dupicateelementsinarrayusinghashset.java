package Interviewquestionsjava;

import java.util.HashSet;

public class dupicateelementsinarrayusinghashset {
    public static void main(String[] args) {
        String arr[] = { "java", "C", "C++", "Python", "Django", "java" };

        HashSet<String> hs1 = new HashSet<>();
        for (String l : arr) {
            if (hs1.add(l) == false) { /// we know in hashset no duplicates are allowed so while iterating the string
                System.out.println("Found duplicate element :" + l);
            }
        }

    }

}
// for (S: arr)
