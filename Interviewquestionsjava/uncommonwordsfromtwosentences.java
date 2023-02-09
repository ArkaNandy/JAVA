package Interviewquestionsjava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class uncommonwordsfromtwosentences {
    public static void main(String[] args) {
        String a = "This apple is sweet";
        String b = "This apple is sour";
        String[] aArray = a.split("\\s+");
        String[] bArray = b.split("\\s+");
        HashMap<String, Integer> hs1 = new HashMap<String, Integer>();

        for (int i = 0; i < a.length(); i++) {
            if (hs1.containsKey(aArray[i])) {
                hs1.put(aArray[i], hs1.get(aArray[i] + 1));
            } else {
                hs1.put(aArray[i], 1);
            }

        }

        for (int i = 0; i < b.length(); i++) {
            if (hs1.containsKey(bArray[i])) {
                hs1.put(bArray[i], hs1.get(bArray[i] + 1));
            } else {
                hs1.put(bArray[i], 1);

            }

        }

        Set<String> s1 = new HashSet<>();
        for (String s : hs1.keySet()) {
            if (hs1.get(s) > 1) {
                continue;

            }
            s1.add(s);

        }

    }

}
