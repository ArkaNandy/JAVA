package Interviewquestionsjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class oddorevevn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Integer>l1= new ArrayList<Integer>();
        System.out.println("Enter your series of number");

         while(sc.hasNextInt()){
                l1.add(sc.nextInt());
                l1.add(sc.nextInt());
                l1.add(sc.nextInt());
         }





            
            System.out.println(decision( l1));
            
        }

        public static boolean decision(List<Integer>l1){
            for(int i: l1){
                if(i%2==0)
                return false;

            }
            return true;
            
        }
    

    
}
