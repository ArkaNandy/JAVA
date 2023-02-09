import java.util.ArrayList;
package CollectionandGenerics;
import java.util.*;

public class iteratorInterface {
    public static void main(String[] args) {
        Collection values = new ArrayList<>();
        values.add(4);
        values.add(6);
        values.add(9); /// adding values to the list

        Iterator it = values.iterator(); // using iterator interface to print the values
        // iterator is an interface used to fetch the values from a collection by iterating

        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
    
}
