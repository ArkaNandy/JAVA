package Methodoverloading;
class Calculator{ // calculator class 
    public void add(int i, int j){ // where ther is function which just adds two functions
        System.out.println(i+j);
    }

    public void add(int i,int j, int k){/// now supposedly we want to add three variables
        System.out.println(i+j+k);

    }
    public void add(double i, double j){ // this method adds two doubles
        System.out.println(i-j);
    }
}

public class Methodoverloading{
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.add(7,8); //
        cal.add(9,3,6);// we calling the method which has the capacity to have three parameters
        cal.add(7.5, 8.5); /// now supposedly we are having integer parameters


        
    }
    
}
