import java.util.*;
public class printthegreetingsusingswitchcase {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int button = sc.nextInt(); /// input from the user for the button

        switch(button){
            case 1 : System.out.println("hello");
            break;

            case 2 : System.out.println("Namaste");
            break;

            case 3: System.out.println("Bonjour");
            break;

            default: System.out.println("Invalid Button");

    


        }

        sc.close();


    }
    
}
