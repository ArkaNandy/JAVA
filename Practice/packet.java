package Practice;

public class packet {
    static boolean check(String s) {
        return false;
    }
    
    public void doSomething(String str){
        int n = str.length();
        for(int i=0;i<n-3;i++){
            boolean response = check(str.substring(i, i + 4));
            if(response) {
                // marker
            }
            else {
                // not a marker
            }
        }

    }
    public static void main(String[] args) {

        
    }

    
}
