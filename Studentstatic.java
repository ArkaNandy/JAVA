class Student{
    String name;
   static String schoolname; /// school name will be same for a ll the students
   //// for school class all the objects will have same school name
public static void changeSchool(){
    schoolname= "newschoolname"; // automatically school name will be changed for all the pupil
    /// in a static way

}

}
public class Studentstatic {
    public static void main(String args[]){
        Student.schoolname = "Sphs"; 
        Student s1 = new Student();
        s1.name="Arka";
        System.out.println(s1.schoolname);
        System.out.println(s1.name);
        // till now we had to make objects of the class and then by putting . 
        // we had to  access the data members or the member functions of the class
        /// but the things we make static ie static methods, functions or static data
        /// we can directly access htem through the class



    }

    
}
