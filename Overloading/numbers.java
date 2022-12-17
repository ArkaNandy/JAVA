package Overloading;

public class numbers {
    int sum(int a, int b){ /// same name function but diffrent 
        return(a+b);


    }

    int sum(int a, int b, int c){
        return (a+b+c);
    }
    public static void main(String[] args) {
        numbers n1= new numbers();
        n1.sum(5,6); /// at compile time only it will know which method to call 
        
        n1.sum(5,9,6);
    }

    
}
