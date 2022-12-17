package Accessmodifiers;

public class A {
    private int num; ///// we cannot really access it or modify it from another package
     /// this provides us with a bit of security called data hiding
     /// we can only access or change private data via getters and setters methods

     public int getnum(){ // getter gets the value 
         return num; /// the object has a getnum method which is public
     }

     public void setnum(){
         this.num=num;
     }
     
      
     String name; /// default constructor
     // in diffrent package it won't be able to allow but in the same package it will allow
     
     int[] array;

    public A(int num, String name, int[] array){
        this.num=num;
        this.name=name;
        this.array=new int[num];
    }
    
}
