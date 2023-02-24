package CollectionandGenerics.Hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Synchronizedhashmap {
    // An alternate version of hashmap which is thread safe
    // has slow performance
    // null key adn multiple null values are allowed

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("1", "Naveen");
        map1.put("2", "Tom");
        map1.put("3", "Lisa");

        Map<String, String> syncMAp = Collections.synchronizedMap(map1);// method to create synchronized map
        // inside syncMap we are storing the synchronizedMap by passing it inside
        // Collections.synchronizedMap

        System.out.println(syncMAp);

        //// Concurrent HashMap
        // thread safe
        // fast
        // null key and values are not allowed
        // multithreading won't be a problem with concurrent hashmap

        ConcurrentHashMap<Integer, String> ch1 = new ConcurrentHashMap<>();

        ch1.put(1, "Delialah");
        ch1.put(2, "Majnu");
        ch1.put(3, "moi");
        System.out.println(ch1.get(3));

    }

}
