package Interviewquestionsjava;

public class missingnumberinanarray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + i;
        }
        System.out.println("sum of the elements in the array  : " + sum);

        int sum2 = 0;
        for (int j = 0; j <= 5; j++) {
            sum2 = sum2 + j;

        }
        int missing = sum2 - sum;
        System.out.println("The missing number in the array is :" + missing);

    }

}
