package Javainterviewquestions2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class printtheduplicatewordsinastring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        String arr[] = input.split(" ");

        Map<String, Integer> hmp1 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hmp1.containsKey(arr[i])) {
                hmp1.put(arr[i], hmp1.get(arr[i]) + 1);
            } else {
                hmp1.put(arr[i], 1);
            }

        }
        Set<Integer> s1 = new HashSet<>();
        for (Entry<String, Integer> value : hmp1.entrySet()) {
            if (value > 1) {
                s1.add(value);

            }

        }
        System.out.println(s1);

    }

}
