package Interviewquestionsjava;

public class Stringsplitting {
    public static void main(String[] args) {
        String str= " ARKA, SNEHEL, SHOUVIK, TANNISHTHA"; 
        String names[]= str.split(",");// the split method in java asks for a regex which means using which character we want to seperate the string or split the string
        System.out.println(names[1]); // by doing this it will be printing the second object stored in the string names which has been separated by commas

        for(String val: names){
            System.out.println(val);
        }


    }
    
}
