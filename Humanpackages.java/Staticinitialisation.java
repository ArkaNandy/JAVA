package Humanpackages.java;
/////demo for initialisation of  static variables

public class Staticinitialisation {
    static int a=4;
    static int b; // we want to do some kind of work to initialise these variables
    //// we can do this via a static block and theat static block will get executed exactly once
    /// when the class is first loaded
    static{
        System.out.println("I am in static block");
        int b= a*6; /// initializing b
    
    }

    public static void main(String args[]){ /// we can even have the main function inside this publlic class because it's static
    Staticinitialisation s1= new Staticinitialisation();

    System.out.println(Staticinitialisation.a+" "+ Staticinitialisation.b);

    Staticinitialisation.b+=3;
    Staticinitialisation s2= new Staticinitialisation(); 
    System.out.println(Staticinitialisation.a+" "+ Staticinitialisation.b);


    





    }



    
}
