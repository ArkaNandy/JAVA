package Finalkeyword; 
 class A{
    public final void show(){ // if we use the final keyword in any method it can't be overriden
        System.out.println("Inside class A");

    } 
}

class B extends A{ 
    public void show(){ /// here the base class show() won't be able to override the parent class show() cause the parent class show is final
        System.out.println("inside class B"); // here the show() will override the method in the paren class also right??

    }


}

public class FinalMethod {
    public static void main(String[] args) {
        A obj1= new A();
        obj1.show();

        B obj2=new B();
        obj2.show();

    }
    
}

