package Interviewquestionsjava;
//Java Program to Count Number of Duplicate Words in Given String

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countnumberofduplicatewordsinagivenstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); /// taking input of the string and storing it inside string input
        input.toLowerCase(); // converting it to lowercase characters
        String array[] = input.split(" "); // splitting the string where we find spaces and storing inside a string
                                           // array
        Map<String, Integer> hs1 = new HashMap<String, Integer>(); /// declaring a hashmap

        for (int i = 0; i < array.length; i++) { // iterating the string array
            // String s = array[i];
            if (hs1.containsKey(array[i])) { // 1st check : whether the word is already present
                hs1.put(array[i], hs1.get(array[i]) + 1); // if present we put the key and increment the value by +1
            } else {
                hs1.put(array[i], 1); // if not present we put the key and initialise the value with 1, indicating
                                      // that the key is appearing for the first time

            }
        }
        System.out.println(hs1);

    }

}
