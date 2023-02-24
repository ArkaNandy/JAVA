package Javainterviewquestions2;

class Employee {
    private int EmpId;
    private String Empname;

    public void setID(int id) {
        this.EmpId = id;
    }

    public int getId() {
        return EmpId;
    }

    public void setName(String name) {
        this.Empname = name;
    }

    public String getName() {
        return Empname;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setID(37);
        e1.setName("Arka");
        System.out.println(e1.getId());
        System.out.println(e1.getName());

    }

}
