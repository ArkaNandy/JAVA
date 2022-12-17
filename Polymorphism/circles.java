package Polymorphism;

public class circles extends shapes {
    @Override /// this is called annotation
    void area(){ //// if you want to check whether a method is overriden or not we write @override over it
        System.out.println("Area is radius square mulltiplied by 3.14");
} // this will run when object of circle is created hence it is overriding the parent method
//@Override
///void areaaaa(){ over her @override will show an error because it is not overriden

//}

}
