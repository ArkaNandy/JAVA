package Interviewquestionsjava;

import java.util.HashMap;
import java.util.Scanner;

public class getdistinctcharactersandgettheircount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        HashMap<Character, Integer> hm1 = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i); /// putting the char value at the specified index inside ch
            if (hm1.containsKey(ch)) { // if the hashmap already contains the value
                hm1.put(ch, hm1.get(ch) + 1); // if the value is already present, we put key and increase the value by
                                              // +1
            } else {
                hm1.put(ch, 1);

            }
            System.out.println(hm1);

        }

    }

}
