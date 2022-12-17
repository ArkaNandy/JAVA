package Interfaces;

interface Demo{
    void abc(); // defining a method which needs to be overriden in the extended class
    default void show(){
        System.out.println("I'm in an interface where by using the default keyword we can define a method from java 1.8");
    } // yes we can define a method inside an interfce
    default void show2(){
        System.out.println("I'm in an default method inside an interface");
    }
}
class Demoimp implements Demo{
    public void abc(){ // overriding the abstract method in the interface
        System.out.println("i'm overriding the defined abstract method in the interface");

    }
    public void show2(){ // we are overriding the default method
        System.out.println("the default method show2() has been overidden");

    }
    
}

public class defaultmethod {
    public static void main(String[] args) {
        Demo obj1= new Demoimp(); // referce out of the interfae and creating the object out of the class
        obj1.show();
        obj1.abc();
        obj1.show2();

        
    } // so we can override default methods
    // we can define methods inside interface by using the keyword default 
    //Functional interface can have only one abstract method but many default methods
    
}
