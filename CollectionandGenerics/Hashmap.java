package CollectionandGenerics;
import java.util.*;


public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm1= new HashMap<>();

        hm1.put("India",200);
        hm1.put("China",300); // put() method to insert in a hashmap

        hm1.put("Us",250);

        System.out.println(hm1); // printing the hashmap
        hm1.put("Us",350);
        System.out.println(hm1);

        if(hm1.containsKey("China")){
            System.out.println("is present in the map");
        }
        else{
            System.out.println("key is not present");
        }

        System.out.println(hm1.get("China")); /// the get() method return the value of the key
        System.out.println(hm1.get("Indonesia")); /// here it will return null as no value is 

        for(Map.Entry<String,Integer> e: hm1.entrySet()){ // tp iterate over the hashmap 
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = hm1.keySet();
        for(String key: keys){
            System.out.println(key +" "+hm1.get(key));
        }


        hm1.remove("China"); // to remove an entry from the hashmap, we use remove() method
        System.out.println(hm1); /// 
        






        
    }
    
}
