package Statickeyword;
class Employee{
    int e_id;
    int salary; //in general when we make variables of a class it gets stored inside heap memeory
    static String ceo; // whenever we declare a variable as static it goes to the class loader memory which is present inside JVM

    static{ // this will get executed when you load a class
        ceo="Larry";
        System.out.println("in static");
    }

    public Employee(){ // this constructor will get executed when we create an object
        e_id=1;
        salary=3000;
        System.out.println("In constructor");

    }



    public void printinfo(){
        System.out.println(e_id+":"+salary+":"+ceo);
    }


}

public class staticblock {
    public static void main(String[] args) {

        Employee rahul= new Employee();
        
        Employee naveen = new Employee();
        


        rahul.printinfo();
        naveen.printinfo();







        
    }
    
}

