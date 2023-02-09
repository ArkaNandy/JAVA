package CollectionandGenerics;

import java.util.HashSet;
import java.util.Scanner;

public class takinguserinputinhashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputsize = sc.nextInt();
        HashSet<Integer> hs1 = new HashSet();
        for (int i = 0; i < inputsize; i++) {
            int input = sc.nextInt();
            hs1.add(input);
        }
        System.out.println(hs1);

    }

}
