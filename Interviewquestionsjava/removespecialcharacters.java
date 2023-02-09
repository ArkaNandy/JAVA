package Interviewquestionsjava;

import java.util.Scanner;

public class removespecialcharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("The string with speacial characters :-" + s);

        String removed = s.replaceAll("[^a-zA-Z0-9]", ""); // replaceAll("[^")
        System.out.println("The string without characters:- " + removed);// ^ denotes NOT the characters we don't want
                                                                         // to remove and remove all the other things
                                                                         // not mentioned

    }

}
