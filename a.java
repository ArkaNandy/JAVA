import java.io.*;
import java.util.*;

class a {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String[] s = in.nextLine().split(",");

        int cntA = 0;
        for(String str : s) {
            if(str.equals("A")) cntA++;
        }

        int[] t = new int[2];

        for(int i = 0; i < cntA - 1; i++) {
            if(s[i].equals("A")) t[0]++;
            else    t[1]++;
        }

        int ans = Integer.MAX_VALUE;

        for(int i = cntA - 1; i < s.length; i++) {
            if(i - cntA >= 0) {
                if(s[i - cntA].equals("A"))  t[0]--;
                else    t[1]--;
            }
            if(s[i].equals("A")) t[0]++;
            else    t[1]++;
            ans = Integer.min(ans, cntA - t[0]);
        }


        if(ans!=0){
            System.out.println(ans);
        }
        else{
            System.out.println(-1);
        }

        in.close();
    }

}