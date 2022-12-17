package Exceptionhandling;

public class arrayexception {
    public static void main(String[] args) {
        int i=8,j=2,k=0;
        int a[]=new int[4];

        try{
            k=i/j;
            for(int c=0;c<=4; c++){ // size of my array is 4 but the 
                a[c]=c+1; // collecting the value of the array, which is 5 so it will throw an exception
            }
            for(int value : a){
                System.out.println(value);
            }
        }

        catch(ArithmeticException ae){
            System.out.println("see the value of the integers");

        }

        catch( ArrayIndexOutOfBoundsException e){
        System.out.println("The value of the array is exceeds 4");

        }
        System.out.println("4");

        


    }
    
}
