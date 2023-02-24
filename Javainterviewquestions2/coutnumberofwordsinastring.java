package Javainterviewquestions2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class coutnumberofwordsinastring {
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
        System.out.println(hmp1);

    }

}
