package Constructorsinjava;
 

    class Calculator{
        int num1;
        int num2;
        String operation;
    

        public Calculator(){ // we are overriding the default constructor

            num1=0;
            num2=0;
            operation="Nothing";

        }

        public Calculator(int i){
            num1= i;
            num2=0;
            operation="Nothing";

        }

        public Calculator(int i, int j){
            num1= i;
            num2=j;
            operation="Nothing";

        }
        public Calculator(int i, int j, String op){
            num1= i;
            num2=j;
            operation=op;

        }
    }
    public class Constructors {
        public static void main(String[] args) {
            Calculator c1= new Calculator();
            Calculator c2 = new Calculator(5);
            Calculator c3 = new Calculator(5,9);

            
        }
    }
    
    


