package Statickeyword;
class Employee{
    int e_id;
    int salary; //in general when we make variables of a class it gets stored inside heap memeory
    static String ceo; // whenever we declare a variable as static it goes to the class loader memory which is present inside JVM

    static{ /// 

    }

    public void printinfo(){
        System.out.println(e_id+":"+salary+":"+ceo);
    }


}

public class statickeyword2 { // we see our main method is also static
    public static void main(String[] args) { // because when we call the main function or main method we don't need object

        Employee rahul= new Employee();
        rahul.e_id=1;
        rahul.salary=10000;
        Employee.ceo="Nikita"; /// here ceo is static so we don't have to specify the object we can directly specify it with class name.
        


        Employee naveen = new Employee();
        naveen.e_id=2;
        naveen.salary=2000;
        Employee.ceo="Milan"; // to access static variables we don't need objects

        naveen.ceo="Nikita"; // this being static whatever we assign it with at the last, that value will get shown for every object made  out of that class



        rahul.printinfo();
        naveen.printinfo();







        
    }
    
}

