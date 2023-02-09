package Interviewquestionsjava;

public class averageofanarray {

    public static void main(String[] args) {

        // create an array
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

        // getting array length
        int length = arr.length;

        // default sium value.
        int sum = 0;

        // sum of all values in array using for loop
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double average = sum / length;

        System.out.println("Average of array : " + average);

    }

}
