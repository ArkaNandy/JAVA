package Innerclass;
class Outer
{
    int a;
    public void show(){ // we can access the show()
        System.out.println("you inside show()");

    }

    class Inner{
        public void display(){
            System.out.println("in display");
        }
    }
}

public class innerclassexample {
    public static void main(String[] args) {
        Outer objouter= new Outer(); 
        objouter.show(); // to access the show();

        Outer.Inner objinner=  objouter.new Inner(); // 
// outer classname.innerclassname inner class obejct= outer classobject.new Innerclassname();

objinner.display();

    }

    
}
