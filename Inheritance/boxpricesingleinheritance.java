package Inheritance;
public class boxpricesingleinheritance extends boxweight{
    double cost;
    boxpricesingleinheritance(){
        super();
        this.cost=-1;
    }
    boxpricesingleinheritance(boxpricesingleinheritance other){
        super(other);
        this.cost=other.cost;
    }
    public boxpricesingleinheritance(double l, double h, double w, double weight){
        super(l,h,w,weight); /// these properties are from the parent class constructor
           //// we use super keyword to access the parent constructor the exact parent
        this.cost=weight; 
    }
}