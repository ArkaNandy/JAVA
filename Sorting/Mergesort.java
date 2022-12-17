
package Sorting;

public class Mergesort {
    public static void conquer(int array[], int si, int mid, int ei) {
        int mergedarray[] = new int[ei - si + 1]; /// the new array to store sorted numbers
        int index1 = si; // si tracking the index first array which has been divided
        int index2 = mid + 1; // mid+1 tracking the index seconfd array which has been divided
        int x = 0; // tracking the index of the new array
        while (index1 <= mid && index2 <= ei) {
            if (mergedarray[index1] <= mergedarray[index2]) {
                mergedarray[x++] = array[index1++];
            }

            else { // index2 is greater than
                mergedarray[x++] = array[index2++];
            }

        }
        while (index1 <= mid) {
            mergedarray[x++] = array[index1++];
        }

        while (index1 <= mid) {
            mergedarray[x++] = array[index2++];
        }
        for (int i = 0, j = mid - 1; i < mergedarray.length; i++) {
            array[i] = mergedarray[i];
        }
    }

    public static void divide(int[] array, int si, int ei) {
        if (si >= ei) { /// base case if starting index is more than ending index or eqauals to ending
                        /// index means either we have single element or we have emptied the array

            return;
        }
        // int mid = (si+ei)/2; // sometimes space complexity issue is faced
        int mid = si + (ei - si) / 2;

        divide(array, si, mid);
        divide(array, mid + 1, ei);
        conquer(array, si, mid, ei);

    }

    public static void main(String[] args) {
        int array[] = { 6, 3, 9, 5, 2, 8 };
        int n = array.length;
        divide(array, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();

    }

}
