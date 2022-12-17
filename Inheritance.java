class Shape{ /// base class or parent class
    String colour; /// property of class shape
    public boolean area(){
        System.out.println("displays area"); // method inside class shape which displays area
        return false;
    }
}

class Triangle extends Shape{ /// class Triangle inherits from class shape
     /// through inheritance reusability is acquired
     public int area(int l, int b){
         int area = 1/2*(l*b);
         return area;

     }
     

}
public class Inheritance {
    public static void main(String args[]){
        Triangle t1= new Triangle();
        t1.colour ="red"; // here we dont't have colour mentioned in class triangle but still we can link the object t1 
         /// with colour because class Triangle has inherited property string colour from class shape
         System.out.print(t1.area());
         
         t1.area(4,5);


    }
    
}
