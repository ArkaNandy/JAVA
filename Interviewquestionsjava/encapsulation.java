package Interviewquestionsjava;
//In Java, encapsulation provides security 

//by means of hiding sensitive data including class attributes and member functions from other classes. To achieve encapsulation in Java, 
//we have to specify the class attributes as private and to access or modify these private variables from some other class,
// we can use the getters and setters as public for each of the class private variables/attributes. 

class employee {
    private int employeeId;
    private String employeename;

    public void setID(int id) {
        this.employeeId = id;

    }

    public void setName(String name) {
        this.employeename = name;
    }

    public int getId() {
        return employeeId;
    }

    public String getName() {
        return (employeename);

    }

}

public class encapsulation {
    public static void main(String[] args) {

        employee e1 = new employee();
        e1.setName("arka");
        System.out.println(e1.getName());

        e1.setID(13);
        System.out.println(e1.getId());

    }

}
