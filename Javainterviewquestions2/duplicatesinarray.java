package Javainterviewquestions2;

public class duplicatesinarray {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 1, 2, 3, 1, 3, 7 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }

}
