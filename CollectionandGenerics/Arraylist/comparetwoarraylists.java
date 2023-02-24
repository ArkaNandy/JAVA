package CollectionandGenerics.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class comparetwoarraylists {
    public static void main(String[] args) {
        ArrayList<String> namelist = new ArrayList<>(Arrays.asList("A", "B", "C", "E"));
        ArrayList<String> namelist2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        ArrayList<String> namelist3 = new ArrayList<>(Arrays.asList("A", "B", "C", "E"));

        Collections.sort(namelist);
        Collections.sort(namelist2);
        System.out.println(namelist.equals(namelist2)); // this would return false
        System.out.println(namelist3.equals(namelist)); // we are comparing two lists and seeing if it is true or not

        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "F"));
        ArrayList<String> list5 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));

        list4.removeAll(list5); // will remove all the common elements

        System.out.println(list4);

        list5.removeAll(list4);
        System.out.println(list5);

    }

}
