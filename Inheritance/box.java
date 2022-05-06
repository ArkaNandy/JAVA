package Inheritance;
public class box {
    double l;
    double h;
    double w;
    box(){ /// constructor
        this.h=-1;
        this.l=-1;
        this.w=-1;


    }

    box(double side){ /// cube
        this.w= side;
        this.l=side;
        this.h=side;

    } // parameterized constructor


    box(double l, double h, double w){ /// cube
        this.w= w;
        this.l=l;
        this.h=h;

    } // parameterized constructor, contains 3 parameters

    box(box old){ ///copy constructor
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }

    public void information(){
        System.out.println("running the box");
    }




    
}
