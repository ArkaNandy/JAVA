public class recursion { //// printing 5 to 1 using recursion
    public static void printNumb(int n){
      //  {
        //    return;
      //  }
        System.out.println(n);
        printNumb(n-1);// the working of the code which will keep degrading the number
        


    }
        public static void main(String args[]){
         
        int n=5;
        printNumb(n);


    }
}
    

