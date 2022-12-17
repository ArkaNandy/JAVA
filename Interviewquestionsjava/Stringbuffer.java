// Strings are immutable which means once we assign any value to string variables even we want to change it later on it not change the old object, it will create a new object for us.
/// What we wanna do is we don't want to create new object, we want to update the old value we don't want to asssign more memory
// in that case what we can do is make our  string mutable by using a class known as string buffer
// string buffer is a class which provides string mutability


package Interviewquestionsjava;


public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sbf1= new StringBuffer("Arka");
        System.out.println(sbf1); // same string objects

        sbf1.append(" Nandy");
        System.out.println(sbf1); // these are the same 
        sbf1.charAt(4);
        


        sbf1.replace(0, 5, " manoj "); // replacing

        System.out.println(sbf1);

        sbf1.delete(5, 11); // delete elements in a string
        System.out.println(sbf1);


    }
    
}

//// String buffer class is a class which provides string mutability
// String buffer is thread safe ie if my application is working with multople threads so in that case, one thread operation should not affect another one, it gurantees synchronization


// String builder has got all the same functions as string builder but it is not thread safe or with no gurantee of synchronization
