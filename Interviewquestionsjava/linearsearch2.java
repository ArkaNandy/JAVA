package Interviewquestionsjava;

public class linearsearch2 {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 9, 12, 13, 22 };
        int key = 22;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found " + i);

            } else {
                System.out.println("Element not present");
            }

        }
    }

}
