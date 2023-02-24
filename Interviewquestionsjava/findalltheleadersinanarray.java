package Interviewquestionsjava;

/// leader elments means after that particular number's position all the elements are smaller than that particular number
/// int a1[]={7,9,8,4,6,3,1}
///in the above array the last elemenet is always a leader element because after it there is no element bigger to it
/// 3 is also a leader element as after it there's no element bigger than it
public class findalltheleadersinanarray {
    public static void main(String[] args) {
        int num[] = { 92, 7, 12, 9, 2, 3 }; // see the last element is always the leader element beacause after it
                                            // there's no number greater than it

        int leader = num[num.length - 1]; /// we are assigning the last element as the leader element
        System.out.print(leader + " ");
        for (int i = num.length - 2; i >= 0; i--) { /// then we are iterating from the second last element, till the
                                                    /// first element of the array
            if (num[i] > leader) { /// to find a number greater than leader element
                System.out.print(num[i] + " "); // we print that number
                leader = num[i]; /// then it is the new leader element
            }
        }
    }

}
