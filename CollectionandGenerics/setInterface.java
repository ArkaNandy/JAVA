package CollectionandGenerics;
import java.util.HashMap;
import java.util.Map;

public class setInterface {
    public static void main(String[] args) {
        Map<String, String> mp = new HashMap<>();
        mp.put("My name","Navin"); // first one is a key and the other one is a value
        mp.put("Actor", "John");
        mp.put("Ceo", "Marisa");
        System.out.println(mp); // we can see there is no proper sequence right? because somewhere it is implementing set and hasing is implied where they don't print out the vaues in proper order

        System.out.println(mp.get("My name")); // supposedly we want to get a particular value from the mapset
        // we use the get() get method where we pass the key to get the value
        System.out.println(mp.get("Actor")); 
        System.out.println(mp.get("Actor1")); // this would give null
        

        
    }

    
}
