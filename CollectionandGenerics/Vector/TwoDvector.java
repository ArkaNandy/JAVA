package CollectionandGenerics.Vector;

import java.util.Vector;

public class TwoDvector {
    public static void main(String[] args) {
        Vector<String> langVector = new Vector<>();
        langVector.add("java");
        langVector.add("Python");
        langVector.add("Ruby");
        langVector.add("Javascript");
        langVector.add("C++");

        Vector osVector = new Vector();
        osVector.addAll(langVector);
        for (int i = 0; i < langVector.size(); i++) {

        }

    }

}
