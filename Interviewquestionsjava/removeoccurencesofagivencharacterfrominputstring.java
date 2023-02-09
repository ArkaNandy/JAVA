package Interviewquestionsjava;

import java.util.Scanner;

public class removeoccurencesofagivencharacterfrominputstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String input= sc.nextLine();
        String removed= input.replace("a"," ");
        System.out.println("The string with removed characters is :"+ removed);
    }
    
}
