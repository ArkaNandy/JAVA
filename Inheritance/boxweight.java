package Inheritance;
public class boxweight extends box{ //// we are inheriting the properties of class box in box weight
    double weight;
    public boxweight(){
        this.weight=-1;

    }

    public boxweight(double l, double h, double w, double weight){
        super(l,h,w); /// these properties are from the parent class constructor
           //// we use super keyword to access the parent constructor the exact parent
        this.weight=weight; 
    } //// if super class constructor requires some parameters then all the sub classes must pass those parameters like over here
     /// if we don't the super keyword here then the default box() constructor will be called
     

}