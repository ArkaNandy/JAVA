class Pen{ /// a class
    String colour; // attributes of the pen /// data members of pen class
    String type; // ball point or gel pen

    public void write(){ /// functions of the pen. Functions written inside class are called METHODS
        System.out.println("Writing something"); /// member functions 
        
    } 

    public void printColour(){
        System.out.println(this.colour); // this is java's keyword
    } /// whichever object calls printColour funtion it will print it's colour

    public void getType(){
        System.out.println(this.type); /// whichever object calls getType will print it's type
    }
}
public class oops { /// objects of a class are made inside main funtions

    public static void main(String[] args){ /// which takes a string of arguments in java
        Pen pen1= new Pen(); /// creating an object of the class pen ie pen1
        pen1.colour ="blue"; /// object's properties
        pen1.type ="gel";

        Pen pen2= new Pen(); /// creating a new object pen2 for class pen
        pen2.colour= "black"; /// pen2's properties
        pen2.type="ball";

        pen2.printColour();
        pen2.write();
        pen2.getType();

        ///// Pen() is a constructor  same name as of class

     pen1.write(); /// to call the method write() // which will print writhing something 
    pen1.printColour();
    pen1.getType();
        

         
         
    }

    
}
