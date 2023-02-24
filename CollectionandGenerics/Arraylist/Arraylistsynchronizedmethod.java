package CollectionandGenerics.Arraylist;

import java.util.concurrent.CopyOnWriteArrayList;
// as we know ArrayList is not thread safe so this class
// this class CopyOnWriteArrayList is just an alternative ofArraylist which is thread safe
// so we can be using it in replacement of Arraylist
// at a time only one thread will be accesing the method

public class Arraylistsynchronizedmethod {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<>();
        empList.add("JAin");
        empList.add("Tom");
        empList.add("Arka");
        empList.add("Berry");

        for (String s : empList) {
            System.out.println(s);
        }

    }

}
