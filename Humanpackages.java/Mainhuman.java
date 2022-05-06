import java.util.*;

public class Mainhuman{
     public static void main(String[]args){
          /// did not need to use the  import statement it because it's in the same folder or package
          Human Arka = Human(22, "Arka Nandy", 1000,false); // creating an object of the class human 
          HumanAmar= new Human(21,"Amar Singh",9000, true);
          Human Arpit = new Human(22,"Arpit Raj",11000,true);
          System.out.println(Arka.name);
          System.out.println(Amar.married);
          System.out.println(Arka.population);
          System.out.println(Arpit.population);
          System.out.println(Human.population); 
          greeting();

          fun f1= new fun();
          f1.apple();

          Mainhuman God= new Mainhuman();
     God.fun();



     }

     static void greeting(){ /// over here we need to use static because it has to get called from the main function which is static
          //// and also static methods or functions can only access static data
          System.out.println("Yo homiezx"); /// thiis is not dependent on objects
          

     }

     void fun(){ /// this is dependent on objects
          System.out.println("This is dependent on objects");
          greeting(); /// we can have a static member inside a non static function but not the opposite
          

     }

}

 class fun{
   void apple(){
           
}
      




}