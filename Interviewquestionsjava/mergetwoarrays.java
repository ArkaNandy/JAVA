package Interviewquestionsjava;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class mergetwoarrays {
    public static void main(String[] args) {
        int a1[] = { 3, 5, 6, 7 };
        int a2[] = { 2, 6, 8, };
        int[] c = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            c[i] = a1[i];

        }
        for (int j = 0; j < a1.length; j++) {
            c[i + a1.length] = a2[j];
        }

    }

}
