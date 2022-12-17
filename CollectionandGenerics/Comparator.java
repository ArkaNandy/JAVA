package CollectionandGenerics;
import java.util.List;
import java.util.Collection;
import java.util.*;




public class Comparator {
    public static void main(String[] args) {
        Collection<Integer> values =new ArrayList<Integer>();
        values.add(404);
        values.add(908);
        values.add(639);
        values.add(265);

        Comparator c= new Comparator(){ // we are making an anonymous class
            public int compareTo(Integer i , Integer j){ // inside this anonymous class we are defining the method
                if(i%10>j%10)
                return 1;
                else
                return -1;
            }
        };
        for(int i=0; i< values.size();i++){
            System.out.println(values.(i));
        }


    }
    
}
