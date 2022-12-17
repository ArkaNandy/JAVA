interface Animal{
    int eyes =2; // will be static for animals ie, same for all animals


    public void walk();  // if we remove public from this function  it will by default be public and abstract no need to mention
}

interface Herbivore{
    
}


    



class Horse implements Animal,Herbivore{ /// horse is an animal as well as a herbivore
    public void walk(){ //// multiple inheritance,which happens through interference only
        /// if there is no access modifier before walk it will be by default 

        System.out.println("walks on 4 legs");
    }

}
public class Abstractioninterface {
   public static void main(String args[]){ /// static keyword means the thing which can be accessible by
    Horse h1= new Horse();
    h1.walk();
    Chicken c1= new Chicken();
    c1.walk();

    }

    
}
