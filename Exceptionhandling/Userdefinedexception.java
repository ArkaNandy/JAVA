package Exceptionhandling;
import java.util.*;


public class Userdefinedexception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;

        try{
         i= sc.nextInt();
        if(i<10){ /// if user gives an input less than 10 then there will be exception handling thing
            throw new Exception("Dafuq you doing bro");
        }
                
    }
    catch(Exception e){
        System.out.println(e);
    }
    
}
}
class Myexception extends Exception // creating a personal exception class so we need to fetch some important properties frm exception
{
    public void MyException(String msg){
        super(msg);
    }
}


