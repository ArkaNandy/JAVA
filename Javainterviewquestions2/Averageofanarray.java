package Javainterviewquestions2;

public class Averageofanarray {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 6, 7, 8, 9, 10 };
        int length = arr.length;
        int arraysum = 0;

        for (int i = 0; i < arr.length; i++) {
            arraysum = arraysum + arr[i];

        }

        double arrayaverage = (arraysum / length);
        System.out.println("Average of the array is :" + arrayaverage);
    }

}
