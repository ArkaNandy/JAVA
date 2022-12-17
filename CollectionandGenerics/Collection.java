package CollectionandGenerics;
import java.util.List;

import java.util.*;


public class Collection {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<Integer>(); // we are having instance of an interface List and adding
        values.add(4);
        values.add(8);
        values.add(1,5);
       // values.add(4.9);
      //  values.add("Arka");

      Collections.sort(values); //Collection is a class and sort, reverse, shuffle are methods which can be applicable oon the lists
      Collections.reverse(values);
      Collections.shuffle(values);
        
        for(int i=0; i<values.size();i++){
            System.out.println(values.get(i));

        }
        

    }

    
}

