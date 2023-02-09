package CollectionandGenerics;

import java.util.ArrayList;
import java.util.List;

public class mergetwolists {
    public static void main(String[] args) {
        List<String>s1= new ArrayList<>();
        s1.add("1");
        List<String>s2= new ArrayList<>();
        s2.add("5");
        
        List<String> mergedList= new ArrayList<>(s1);
        mergedList.addAll(s2);
        System.out.println(mergedList);




    }
    
}
