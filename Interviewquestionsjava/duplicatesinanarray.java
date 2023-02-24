package Interviewquestionsjava;

public class duplicatesinanarray {
    public static void main(String[] args) {
        int a1[] = { 3, 5, 6, 8, 9, 10, 9, 3 };
        for (int i = 0; i < a1.length; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[i] == a1[j]) {
                    System.out.println(a1[j]);
                }
            }
        }

    }

}
