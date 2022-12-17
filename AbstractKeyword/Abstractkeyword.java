package AbstractKeyword;
abstract class Human{
    public abstract void eat();

    public void walk(){

    }
}

class Male extends Human{ /// one can make subclass of the abstract class and create object out of it
    public void eat(){ // whenever a class extends an abstract class it is compulsary to define the abstract method which is in the parent class
        System.out.println("Eats eggs for gains");

    }
    public void walk(){
        System.out.println("Walks on two legs");
    }

}
class Female extends Human{


    public void eat() {
        System.out.println("Eats protein for gains");
        
        
    }

    public void walk(){
        System.out.println("Might be crawling");
    }
    
}

public class Abstractkeyword {
    public static void main(String[] args) {

      //  Human h1= new Human(); /// this is not possible as we cannot make an object out of absract class
      Male m1=new Male(); // we can create an object out of a sub class of an abstract class
      m1.eat();
      m1.walk();

      Female f1= new Female();
      f1.eat();
      f1.walk();
      }



        
    }
    

