package AnonymousInnerClass;
class A{
    public void show(){
        System.out.println("I'm the best"); // if we want a method to ovveride it for once only we can use anonymous class
    }
}

public class Anonymous {
    public static void main(String[] args) {
        A obj1 =new A(){
            public void show(){
                System.out.println("Hey i've ovveriden");
            }
        };
        obj1.show();
        
    }
    
}
