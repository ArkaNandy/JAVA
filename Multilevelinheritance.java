class Shape{ /// base class or parent class
    String colour; /// property of class shape
    public void area(){
        System.out.println("displays area"); // method inside class shape which displays area
    }
}

class Triangle extends Shape{ /// class Triangle inherits from class shape
     /// through inheritance reusability is acquired
     public void area(int l, int b){
         int area =(l*b)/2;
         System.out.println(area);
         System.out.println();

     }
}

class EquilateralTriangle extends Triangle{ //// multi level inheritance from shape and even triangle class
    public void area(int l, int b){ /// it is taking data from class Triangle which is inherited data from
        int area = (l*b)/2;
         System.out.println(area);

    }  
 
}


public class Multilevelinheritance {
    public static void main(String args[]){
        Triangle t1= new Triangle();
        t1.colour ="red"; // here we dont't have colour mentioned in class triangle but still we can link the object t1 
         /// with colour because class Triangle has inherited property string colour from class shape
         t1.area();
         t1.area(4,5);

         EquilateralTriangle E1 = new EquilateralTriangle();
         E1.area();
         E1.area(7,8);
         
         System.out.println(t1.colour);


    }
    
}


