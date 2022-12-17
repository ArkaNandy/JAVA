package Abstraction;
public abstract class Animal{ /// An abstract class is a class one cannot instantiate but you can make sub classes of this class which can be instantiated
    int age;
    String name;

    public abstract void makenoise(); // we can choose have have abstract method
                                       

    /// it is absolutely normal for an animal to make noise, but each animal has a diffrent voice
     // but it doesn't make sense to actually implement makenoise method
     /// when you make an abstract function or a method we don't need to specify a body for the method
    /// but in all the child classes of your abstract class
    //// you have to actually create an implementation of the make noise method
}