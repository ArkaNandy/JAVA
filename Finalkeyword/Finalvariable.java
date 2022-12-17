package Finalkeyword;
class A{
    final int DAY=10;
    public A(){
      //  DAY=19; /// this won't be possible once we declare a variable final
     // when we use final infront of a variable they are constant
    

    }
}

public class Finalvariable {
    public static void main(String[] args) {
        A obj1=new A();
        System.out.println(obj1.DAY);
    

    }

    
}
