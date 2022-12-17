package Multithreading; // Supposedly we want to print hello and hi 5 times but the print should have 5 seconds delay among each other
class Hi extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hi"); /// this would normally print out the hi statements 5 times
            /// we want a delay of 5 seconds after every print
            try{
                Thread.sleep(5000); //by using the sleep method we can delay the output by the amount of time we want
            }
            catch (Exception e){

            }
        }
    }
}

class Hello extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello"); // this would normally print ou th the hello state ment 5 times
            try{
                Thread.sleep(5000); //by using the sleep method we can delay the output by the amount of time we want
            }
            catch (Exception e){

            }
        }
    
    }
}

public class Sleepthreading2 {
    public static void main(String[] args) {
        Hi h1= new Hi();
        h1.start();


        Hello h2= new Hello();
        h2.start();
    }
    
}
