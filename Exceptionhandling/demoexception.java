package Exceptionhandling;

import java.util.concurrent.ExecutionException;

public class demoexception {
    public static void main(String[] args) {
        int i,j,k=0;
        i=8;
        j=0;

        try{
            k=i/j;
        }

        catch(Exception exception){
            System.out.println(exception);
        }
        System.out.println(k);

    }
    
}
