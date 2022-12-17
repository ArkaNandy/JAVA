package Thiskeyword;
class Calculator{
    int num1;
    int num2;
    int num3;
    public Calculator(int num1, int num2){ // the local variable always shawdows the instance variable, for this we specifically use this keyword as this 
        this.num1=num1; // the side with this keyword is the instance variable anf then we are storing it inside a local variable
        // this.num1 is the parameter value passed
        this.num2=num2; 
        //it's not always required to use the this keyword
        // it is used when the instance variable and the local variable have the same name
        // to refer to the local variable we have to use a this key word
        
        

    }
}

public class thiskeyword {
    public static void main(String[] args) {
        Calculator cal= new Calculator(4,5);
        System.out.println(cal.num1);
        System.out.println(cal.num2);
        
    }
    
}
