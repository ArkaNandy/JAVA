package AbstractKeyword;
class Printer{
    public void show(Number i){ // super class Number which is abstract form
        System.out.println(i);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Printer obj1= new Printer();
        obj1.show(5);
        obj1.show(5.5);
    }
    
}
