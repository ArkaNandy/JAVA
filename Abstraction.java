abstract class Animal{ /// just a concept
    abstract void walk(); /// this just means there should be a function like this existing in every animal
    Animal(){ // constructors and methods can be there
        System.out.println("You are creating a new animal");

    }
    public void eat(){
        System.out.println("Animal eats");
    }


    
}

class Horse extends Animal{
    Horse(){
        System.out.println("Created a horse");
    }

    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}


public class Abstraction{
    public static void main(String args[]){
        Horse horse= new Horse();
        horse.walk();

        /// we can't make object of a class which is abstract

       /// animal.walk();
      // Animal ani= new Animal();

        horse.eat();
         
    }

}