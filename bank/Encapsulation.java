package bank;

class Account{
    public String name; /// public is an access modifier ie it can be accessed from anywhere in the code or from a diffrent package
     /// if someone makes an object of this class can be accessed from anywhere


     int accountnumber; /// default access, inside this package all the things can access it but not from any other package


     protected String email; /// protected is an access modifier which means data protected can only accessed via sub classes in other packages
     /// and in current package anyone can access


     private String password; /// private datas can only be accessed by the class account, not from anywhere else
     //// now to access private data we need two methods getters and setters
     /// getters means to return the information of the private data
     //// setters are to set value of the private thing
     // which means we directly can't acces the private thing we need to make functions for it

     public String getPassword(){ // getter
         return this.password;

     }

     public void setPassword(String pass){
         this.password = pass; // Storing the password in the string

     }

}
public class Encapsulation {
    public static void main(String args[]){ // things inside main class should be public
        Account account1 = new Account(); // creating an  object for class Account
        account1.name = "Arka"; // the public name can be accessed from here
        account1.email="ridiculousperson@gmail.com"; //accessing protected data member of class Account
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());

        


    }
    
}
