package Statickeyword;
class Employee{
    int e_id;
    int salary; //in general when we make variables of a class it gets stored inside heap memeory
    static String ceo; // whenever we declare a variable as static it goes to the class loader memory which is present inside JVM
  /// static variables are not object specific, it can change for all the the objects if we declare once at anytime 
    public void printinfo(){
        System.out.println(e_id+":"+salary+":"+ceo);
    }


}

public class statickeyword {
    public static void main(String[] args) {

        Employee rahul= new Employee();
        rahul.e_id=1;
        rahul.salary=10000;
        rahul.ceo="Nikita";
        


        Employee naveen = new Employee();
        naveen.e_id=2;
        naveen.salary=2000;
        naveen.ceo="Milan";

        Employee.ceo="Arka"; // this being static whatever we assign it with at the last, that value will get shown for every object made  out of that class

    


        rahul.printinfo();
        naveen.printinfo();







        
    }
    
}
