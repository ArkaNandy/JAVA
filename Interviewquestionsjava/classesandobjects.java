package Interviewquestionsjava;

class A {
    String name;
    int rollno;
    static String classTeacher;

    public void show() {
        System.out.println("Name :" + name + "Rollno :" + rollno + "Class Teacher :" + classTeacher);
    }

}

public class classesandobjects {
    public static void main(String[] args) {
        A std1 = new A();
        std1.name = "Arka";
        std1.rollno = 37;
        std1.classTeacher = "Venkat";

        std1.show();

    }

}
