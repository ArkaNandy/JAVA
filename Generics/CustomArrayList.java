package Generics;

import java.util.ArrayList;

public class CustomArrayList {
    private int[] data; // can't directly change it only be changed via getters and setters
    private int default_size=10;
    private int size=0;

    CustomArrayList(){
        this.data= new int[default_size];
    }
    public void add(int num){
        if(isFull()){
            resize();

        }
        data[size++]

    }


    public static void main(String[] args) {

     




        
    }
    
}
