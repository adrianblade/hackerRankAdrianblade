package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class LeftRotate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        int n = 5;
        //int k = in.nextInt();
        int k = 4;
        //int a[] = new int[n];
        /*for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }*/
        int[] a = {1,2,3,4,5};
        rotate(a, k);
        System.out.println(Arrays.toString(a));
    }

    /**
     * Rotate n order to left in array
     * @param arr
     * @param order
     */
    public static void rotate(int[] arr, int order) {
        if (arr == null || order < 0) {
            throw new IllegalArgumentException("The array must be non-null and the order must be non-negative");
        }
        int offset = order % arr.length;
        if (offset > 0) {
            int[] copy = arr.clone();
            for (int i = 0; i < arr.length; ++i) {
                int j = (i + offset) % arr.length;
                arr[i] = copy[j];
            }
        }
    }
}
