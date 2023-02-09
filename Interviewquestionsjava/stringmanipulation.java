package Interviewquestionsjava;

public class stringmanipulation {
    public static void main(String[] args) {
        String str = "The rains have started here";
        System.out.println("The length of the string str is : " + str.length()); // to find the length of the string
        System.out.println("At 6th position the element present is : " + str.charAt(6)); /// returns the elemnt present
                                                                                         /// in the particular position
                                                                                         /// in the
        /// chaAt(position)
        System.out.println(str.indexOf('e'));
        System.out.println(str.indexOf('e', str.indexOf('e') + 1));
        System.out.println(str.indexOf("started"));

        String str2 = "The rains have started here";
        String str3 = "The rains have started there";

        System.out.println(str.equals(str2)); // would compare bothe the strings and return a boolean value
        System.out.println(str.equals(str3)); // would compare bothe the strings and return a boolean value
        String uppercase = str.toUpperCase(); // converts the string to uppercase characters

        System.out.println(uppercase);

        System.out.println(str.substring(6, 11)); // returns the substrings if the beginning and the ending index is
                                                  // provided

        String str4 = "   Hello  world";
        System.out.println(str4.trim()); // will remove the white spaces before and after the letters

        System.out.println(str4.replace(" ", ""));

        String date = "01/06/2017"; // i want the output like 01-06-2017
        System.out.println(date.replace("/", "-"));

        String test = "hello_World_test_selenium";
        String testval[] = test.split("_"); // split method breaks a string according to the parameter passed so we need
                                            // a array or a type of data structure to contain it

        for (int i = 0; i < testval.length; i++) {
            System.out.println(testval[i]);
        }

        System.out.println(str4.concat(" homies"));

        String x = "Hello";
        String y = "World";
        int a = 100;
        int b = 200;
        System.out.println(x + y);
        System.out.println(a + b);
        System.out.println(x + y + a + b);
        System.out.println(a + b + x + y);
        System.out.println(x + y + (a + b));

    }

}
