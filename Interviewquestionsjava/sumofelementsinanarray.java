package Interviewquestionsjava;

public class sumofelementsinanarray {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 12, 18 };
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum = sum + arr[i];
            System.out.println(sum);

        }

    }

}
