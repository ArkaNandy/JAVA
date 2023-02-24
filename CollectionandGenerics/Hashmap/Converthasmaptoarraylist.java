package CollectionandGenerics.Hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Converthasmaptoarraylist {
    public static void main(String[] args) {
        HashMap<String, Integer> hm1 = new HashMap<>();

        hm1.put("Google", 10000);
        hm1.put("Amazon", 30000);
        hm1.put("Facebook", 40000);
        hm1.put("Cisco", 50000);
        hm1.put("walmart", 60000);
        System.out.println("Total number of companies + :" + hm1.size());

        System.out.println(hm1);

        /// Coverting hashmap keys into arraylist
        List<String> namelist = new ArrayList<>(hm1.keySet());

        System.out.println("Total number of comapnies : " + namelist.size());

        for (String s : namelist) {
            System.out.println(s);
        }

        /// Converting hashmap values into arrraylist
        List<Integer> Compvalue = new ArrayList<>(hm1.values());
        Collections.sort(Compvalue);
        for (Integer i : Compvalue) {
            System.out.println(i);

        }
    }

}
