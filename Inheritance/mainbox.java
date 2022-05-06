package Inheritance;
public class mainbox {
    public static void main(String[] args) {
        box b1= new box(); // this will call the non parameterized constructor
        System.out.println(b1.l+" "+ b1.w + " "+ b1.h);


        box b2= new box(4);// calling the parameterized constructor with one argument passed to it
        System.out.println(b2.l+" "+ b2.w + " "+ b2.h);

        box b3= new box(4.5,7.8,9.2);
        System.out.println(b3.l+" "+ b3.w + " "+ b3.h);

        box b4=new box(b2);
        

        boxweight bw1= new boxweight();
        System.out.println(bw1.h + " "+ bw1.w );


        box b5= new boxweight(2,3,4,5); // creating a parent object to access the propert
       System.out.println( b5.w);  /// the type of reference variable and not the type of objects that determines what members can be accessed


         





        
        
    }
    
}


