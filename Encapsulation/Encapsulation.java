package Encapsulation;
class Student{
    private int rollno;
   private String name;
    public void setRollno(int r){ // setting the value of roll no by passing the value int r
        rollno=r;
        System.out.println("user has changed the roll no");
    }

    public String getName() {
        System.out.println("User wants to know the name");
        return name;
    }

    public int getRollno(){ // returning the value of roll no
        
        System.out.println("User wants to know the value"); // using these print statements so to be clear these methids has been used
        return rollno;


    }

    public void setName(String name){
        System.out.println("User wants to set the name");
        this.name=name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.setRollno(2);
        s1.setName("arka");
        
        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
    }
    
}
