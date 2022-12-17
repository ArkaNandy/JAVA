package Varags;
class Calculator{
    public int add(int i, int j){
        return i+j;
    }

    public int add2(int...n){ // in this method it doesn't matter how many parameters we have passed
                 ///// the parameters would reach here as an array
                 /// here in varags the parameters are being passed in an array format


                 int sum=0;
                
                
                for(int i:n){
                    sum= sum+i;
                 }

                 return sum;


    }
}

public class varagsdemo { // this is called variable length arguments 
    public static void main(String[] args) {
        Calculator cal= new Calculator();
        cal.add(4,5);
        System.out.println(cal.add(4,5)); // limited parameters easy to add
         /// now if we want to add n number of integers or pass many parameters

         Calculator cal2= new Calculator();
         cal2.add2(1,7,5);
         System.out.println(cal2.add2(5,7,8,9)); /// no matter how many arguments we pass it will accept
         
        


    }

    
}
