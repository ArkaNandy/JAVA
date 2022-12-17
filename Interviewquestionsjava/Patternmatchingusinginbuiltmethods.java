package Interviewquestionsjava;

public class Patternmatchingusinginbuiltmethods {
    public static void main(String[] args) {
        String text="Arka Nandy";
        String pattern="rka";
        boolean result=text.contains(pattern); // result is going to store if that particular pattern  matches the text string
        
        if(result==true){
            System.out.println("Pattern is found");
        }
        else{
            System.out.println("pattern not found");
        }
        
    }
    
}
