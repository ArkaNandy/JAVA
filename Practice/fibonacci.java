package Practice;
// the program is given the number 6 it will return the 6th element int he fibonacci series

 

 public class fibonacci {
//     public static int fibonacci(int n){ //fib(n)= fib(n-1)+fib (n-2) ///// recursive way
//         if(n<=1){
//             return n;
//         }
//         return(fibonacci(n-1)+ fibonacci(n-2));

//     }

    public static void main(String[] args) {
        int n=32; // the number in the fib series we are going to return
     //  System.out.println( fibonacci(n)); 
     int fib[]= new int[n+1];  // declaring an array fib.  n+1 being the size
     fib[0]=0; // initialising the value fib[0] will be 0
     fib[1]=1; // fib[1] wil be 1
     for(int i=2;i<n+1;i++){ /// iterating the array
         fib[i]=fib[i-1]+fib[i-2]; /// fib(n)= fib(n+1)+fib(n+2)
     }
     System.out.println(fib[n]);/// printing the value or the fib(n)
        
    }
    
}
