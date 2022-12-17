package Interviewquestionsjava;

public class Patternmatchingwithoutusinginbuiltmethods {
    public static void main(String[] args) {
        String text="navinreddy";
        String pattern="rdd";
        int count=0;
        boolean result= false;

        int textlength= text.length();
        int patternlength= pattern.length();
        
        char c,p;
        for(int i=0;i<textlength;i++){
            c= text.charAt(i);
            p=pattern.charAt(i);
            if(c==p){
                for(int j=i,k=0;j<i+patternlength;j++,k++ ){
                    
                }

            }
        }

    }
    
}
