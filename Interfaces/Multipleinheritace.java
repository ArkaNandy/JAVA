package Interfaces;
interface Demo1{
    default void show(){
        System.out.println("I'm in interface Demo");
    }
}
interface Mydemo{
    default void show(){
        System.out.println("I'm in interface Mydemo");
    }
}
class Demoshow implements Demo,Mydemo{
    public void abc(){
        System.out.println("In class Demoshow and function abc");
    }

    public void show(){
        Mydemo.super.show();
        Demo.super.show();
    }

}

public class Multipleinheritace {
    public static void main(String[] args) {
        Demo obj1= new Demoshow();
        obj1.show();
    }
    
}
