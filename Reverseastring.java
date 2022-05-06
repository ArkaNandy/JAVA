public class Reverseastring {
    public static  void main(String args[]){
        StringBuilder sb= new StringBuilder("hello");
        for(int i=0; i<sb.length()/2;i++){ /// in thia we calculate the front index and the back index that we need to replace
            
            int front=i;
            int back = sb.length() -1-i; // 5-1-= =4

            char frontChar = sb.charAt(front);
            char backChar= sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);


        }

        System.out.println(sb);

    }
    
}
