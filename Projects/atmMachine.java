package Projects;
import java.util.*;


public class atmMachine {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       int amount=0; // let the initial amount be 0;

        System.out.println("Please enter your name");
        String name= sc.nextLine();

        System.out.println("Please enter your password");
        String password = sc.nextLine();

     

        System.out.println("Press 1 for depositing cash");
        System.out.println("Press 2 for withdraw cash");
        System.out.println("Press 3 to see the remaining balance in your account");
        System.out.println("Press 4 to exit");

       int user_input= sc.nextInt();  // the input user will be giving after entering their name and password

       do{

        if(user_input==1){
            System.out.println("Enter the amount you want to deposit");
            int depositcash= sc.nextInt();
            amount=amount+depositcash;
            System.out.println("Amount deposit successfully");
        }
        else if(user_input==2){
            System.out.println("Enter the amount you want to withdraw");
            int withdrawcash=sc.nextInt();
            if(withdrawcash<=amount){
            amount=amount-withdrawcash;
            System.out.println("Amount successfully withdrawn ");
            }
            else{
            System.out.println("Insufficient funds");
            }

        }
        else if(user_input==3){
            System.out.println("Your remaining balance is :"+ amount);



        }
        

    }
    while(user_input!=4);








        
    }
    
}
