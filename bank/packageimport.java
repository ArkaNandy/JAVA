import bank; /// here we are importing a package which has information, basically we are linking a code with another one 
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




public class packageimport {
    public static void main(String args[]){
        bank.Account account1 = new bank.Account(); // here we are putting information of the accounts
        account1.name="Customer1"; /// this is how we use information from a diffrent package in our present code

        

    }
    
}


