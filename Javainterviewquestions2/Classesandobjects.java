package Javainterviewquestions2;

class A {
    int rollno;
    String name;
    static String classTeacher = "NAveen"; // a static variable can be declared in the class itself it will be same for
                                           // all the objects made out of class A

    public void show() {
        System.out.println(
                "Student roll no: " + rollno + "  Student name: " + name + "  Student classteacher: " + classTeacher);
    }
}

public class Classesandobjects {
    public static void main(String[] args) {
        A std1 = new A();
        std1.rollno = 37;
        std1.name = "Warikoo";
        std1.show();

        A std2 = new A();
        std2.name = "Moi";
        std2.rollno = 35;
        std2.show();

    }

}
