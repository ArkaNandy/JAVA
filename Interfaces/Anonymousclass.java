package Interfaces;
interface Abc{
    void show();
}



public class Anonymousclass {
    Abc obj1= new Abc(){ /// in general we cannot instantiate an interface but here we are making the anonymous class to instantiate it
        public void show(){ // implementation of the interface
            System.out.println("Implementation of the interface");
        }

    };
}
