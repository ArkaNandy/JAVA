package Interfaces;
interface Abc{
    void show();
}
class Implimentor implements Abc{
    public void show(){
        System.out.println("Print anything");

    }
}

public class Interface {
    public static void main(String[] args) {
        Abc obj1= new Implimentor();
        obj1.show();
    }

    
}
