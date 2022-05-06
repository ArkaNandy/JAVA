class Shape{ /// base class or parent class
    String colour; /// property of class shape
    public void area(){
        System.out.println("displays area"); // method inside class shape which displays area
    }

    
}

class Triangle extends Shape{ /// class Triangle inherits from class shape
     /// through inheritance reusability is acquired
     public void area(int l, int b){
         int area = 1/2*(l*b);
         System.out.println(area);

     }
}

class EquilateralTriangle extends Triangle{ //// multi level inheritance from shape and even triangle class
    public void area(int l, int b){
        int area = (l*b)/2;
         System.out.println(area);

    }

}

class Circle extends Shape{ /// same class extended
    public void area(int r){
    double area = (3.14)*r*r;
    System.out.println(area);
    }
}




public class Hierarchialinheritance {
    public static void main(String args[]){
        Triangle t1= new Triangle(); // creating an object of class Triangle
        t1.colour ="red"; // here we dont't have colour mentioned in class triangle but still we can link the object t1 
         /// with colour because class Triangle has inherited property string colour from class shape
         t1.area();
         t1.area(4,5);
         System.out.println(t1.colour);

         EquilateralTriangle e1 = new EquilateralTriangle();
         e1.area(7,8);

         Circle c1= new Circle();
         c1.area(6);


    }
    
}


