import java.util.*;

public class Human{
    int age;
    String name;
    int salary;
    boolean married;
    static long population;// when a member is declared static it can be accessed before any of the object of the class is being created 

    public Human(int age, String name, int salary, boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population +=1; /// whenever we create a new object of the class Human it gets incremented by 1


    }

    


}