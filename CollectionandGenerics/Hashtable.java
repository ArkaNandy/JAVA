package CollectionandGenerics;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashtable{ // hashtable is synchronized
    // if we want thread safety we use hashtable
    public static void main(String[] args) {
        Map<String, String> mp = new HashMap<>();
        mp.put("My name","Navin"); // first one is a key and the other one is a value
        mp.put("Actor", "John");
        mp.put("Ceo", "Marisa");
        mp.put("Actor", "Akshay"); // it would make the actor value as Akshay, but won't have redundant data
         // we can repeat the values but we cannot repeat the keys
        System.out.println(mp); // we can see there is no proper sequence right? because somewhere it is implementing set and hasing is implied where they don't print out the vaues in proper order

        Set<String> keys= mp.keySet();

        for(String key : keys){
            System.out.println(key +" "+mp.get(key) );

        }

        
    }

    
}

