package overriding;
class A{
    int i;

    public  void show(){
        System.out.println(i+" "+"in A");

    }
}

class B extends A{
    int i;
    @Override
    public void show(){
        i=8; // this will be initialising the value of the child class with 8
        super.i=7; // this will be initialising the value of the parent class integer as 7
        


       // super.show(); // using this show(),the obj1 object will call the show()and then the show() will call super.show()
        /// super.show() will print the statements inside show() which is in the super class even
        System.out.println(i+" "+ "in B");// first the show() inside child class will get executed
       // super.show(); // then the show() in the the parent class

    }
}

public class Overriding {
    public static void main(String[] args){
        B obj1=new B();
        obj1.show(); /// this will call the child class constructor

/// this is hoew the child class constructor will override the parent class constructor
    }
    
}
