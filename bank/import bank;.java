import bank;
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
        int area = 1/2*(l*b);
         System.out.println(area);

    }

}

class Circle extends Shape{
    public void area(int r){
    double area = (3.14)*r*r;
    System.out.println(area);
    }
}




public class Hierarchialinheritance {
    public static void main(String args[]){
        bank.Account account1 = new bank.Account(); ////
        account1.name="Arka";
        

    }
    
}


