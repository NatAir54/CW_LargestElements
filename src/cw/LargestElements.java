package cw;

import java.util.Arrays;

/* Write a program that outputs the top n elements from a list.
 * Example:
 * largest(2, new int[]{7, 6, 5, 4, 3, 2, 1})
 * // => new int[]{6, 7}
 */

public class LargestElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(largest(1, new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(largest(2, new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(largest(4, new int[]{3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(largest(3, new int[]{1, 2, 1, 1})));
        System.out.println(Arrays.toString(largest(5, new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(largest(0, new int[]{7, 6, 8})));
    }

    public static int[] largest(int n, int[] arr) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr, arr.length - n, arr.length);
    }
}
