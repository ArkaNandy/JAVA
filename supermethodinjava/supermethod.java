package supermethodinjava;
class A{
    public A(){
        System.out.println("inside A");
    }
    public A(int i){
        System.out.println("in A int");

    }
}

class B extends  A{
    public B(){
        super(5);// default of B and parameterized of A 
        System.out.println("inside B");
    }
    public B(int i){
     //   super(i); // with the help of the super keyword, it wi help us call the parameterized constructor of the super class
        System.out.println("in B int");

    }
}

public class supermethod {
    public static void main(String[] args) {
      //  A obj1=new A(); // when we creating an onject of the super class it only calls for the super class constructor
       B obj2=new B(); // when we create an object of the sub class it calls the super class constructor first then the then the sub class constructor
      // B obj3= new B(5); /// but in this case it will call the default constructor of the super class, the default constructor in the sub class and the parameterized constructor of the sub class
      //  A obj4= new A(7); // parameterized constructor of the super class

 
        
    }
    
} 
