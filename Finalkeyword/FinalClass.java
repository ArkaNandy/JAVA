 package Finalkeyword; 
final class A{ // why would we create a final class??
    // so that no other class can extend the base class
    public  void show(){
        System.out.println("Inside class A");

    } 
}

class B extends A{ // anyone can extend the class make objects out of the child class and call the parent class method
    public void show(){
        System.out.println("inside class B"); // here the show() will override the method in the paren class also right??

    }


}

public class FinalClass {
    public static void main(String[] args) {
        A obj1= new A();
        obj1.show();

        B obj2=new B();
        obj2.show();

    }
    
}
