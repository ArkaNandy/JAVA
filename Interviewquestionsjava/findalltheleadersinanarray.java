package Interviewquestionsjava;

/// leader elments means after that particular number's position all the elements are smaller than that particular number
/// int a1[]={7,9,8,4,6,3,1}
///in the above array the last elemenet is always a leader element
public class findalltheleadersinanarray {
    public static void main(String[] args) {
        int num[] = { 92, 7, 12, 9, 2, 3 };

        int max = num[num.length - 1];
        System.out.print(max + " ");
        for (int i = num.length - 2; i >= 0; i--) {
            if (num[i] > max) {
                System.out.print(num[i] + " ");
                max = num[i];
            }
        }
    }

}
