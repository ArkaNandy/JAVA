

   

public  class innerclasses {

    static class Test{
        String name;
        public Test(String name){
            this.name=name;
            
    
    
    
    
        }
    
    

    }
    
    public static void main(String[] args){
        Test a= new Test("Arka");/// this will show error if class Test is inside another class or not  declared as static
    Test b= new Test("Snehel");

        
   

    System.out.println(a.name);
    System.out.println(b.name);

    }
}

