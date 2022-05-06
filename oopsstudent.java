class Student{
    int age;
    String name;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() //// function having the same name that of the class inside the class is called a constructor
    {
        System.out.println("constructor called"); /// non- parameterised constructor
    }

    Student(String name, int age){ //// parameterised constructor 
        this.name=name;
        this.age=age; /// in parameterisedconstructor parameters are being passed, and then the parameters are being assigned into objects
        System.out.println("Parameterised constructor called");

    }

    Student(Student s3){ //// copy constructor
        this.name=s3.name;
        this.age=s3.age;

    }

}

public class oopsstudent {
    public static void main(String args[]){
        Student s1 = new Student("aman",24 ); /// new keyword inside memeory heap a space will get allocated for s1 object
        s1.printInfo(); /// this is calling the parameterised constructor
        
       Student s2 = new Student(); // this is calling the non parameterised constructor
        
        s2.name="Arjun";
        s2.age=27;
        s2.printInfo();

       Student s3 = new Student(s2);
       s3.printInfo();

       


    }
    
}
