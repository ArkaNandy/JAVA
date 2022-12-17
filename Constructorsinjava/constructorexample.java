package Constructorsinjava;
class Calculator{
    int num1;
    int num2;
    int result;
    char z;
    String s;
    public Calculator(){ //default constructor
        num1=0;
        num2=0; // as we see constructors are just for assigning values, they don't return any value
        System.out.println("Here we are basically overiidng the default constructor");

    }
    public Calculator(int n, int k){ //parameter which is taking a parameter

        num1 = n; // here we are storing the values of the local variables inside instance variables
        num2=k;
        System.out.println("We are inside the parameterized constructor which accepts two integer values");


    }

    public Calculator(int x, char b, String h){ //// we can have multiple constructors but should have different parameters
        

       num1= x;
       z =b;
       s=h;
       System.out.println("Here we are inside a constructor which accepts an integer value, character value as well as a string");


    }

}



public class constructorexample {
    public static void main(String[] args) {
        Calculator cal1= new Calculator(); // calling the default constructor
        System.out.println(cal1.num1);
        System.out.println(cal1.num2);
        

        Calculator cal2 = new Calculator(5, 'z', "Arka");
        System.out.println(cal2.num1);
        System.out.println(cal2.z);
        System.out.println(cal2.s);


        
    
        Calculator cal3= new Calculator(7,3);
        System.out.println(cal3.num1);
        System.out.println(cal3.num2);

        
     
        
    }
    
}
