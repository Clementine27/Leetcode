 


/** FAST AND SLOW POINTERS
 *  Given an even-sized array arr[] of length n. A dominant pair (i, j) is defined as:

 *  *i belongs to the first half of the array, (0 <= i < n/2)
 * j belongs to the second half of the array, (n/2 <= j < n)
 * The value at index i is at least five times the value at index j, (arr[i] >=
 * 5 * arr[j])

 *  *The task is to find the count of total number of dominant pairs in the array.

 *  *Examples:

 *  *Input: arr[] = [10, 2, 2, 1] Output: 2 Explanation: First half: [10, 2],
 * Second half: [2, 1]. So valid pairs are:  *
 * {0, 2}: 10 >= 5 × 2 {0, 3}: 10 >= 5 × 1  *
 * So, total dominant pairs = 2.

 *  *Input: arr[] = [10, 8, 2, 1, 1, 2] Output: 5 Explanation: First half: [10, 8,
 * 2], Second half: [1, 1, 2]. So valid pairs are:  *
 * {0, 3}: 10 >= 5 × 1 {0, 4}: 10 >= 5 × 1 {0, 5}: 10 >= 5 × 2 {1, 3}: 8 >= 5 ×
 * 1 {1, 4}: 8 >= 5 × 1  *
 * So, total dominant pairs = 5.
 */

import java.util.Arrays;

public class _Redo_dominantPair {

    public static int dominantPairs(int[] arr) {
        int halfway = arr.length / 2;
        int count = 0;
        int right = halfway;

        Arrays.sort(arr, 0, halfway);
        Arrays.sort(arr, halfway, arr.length);

        for (int i = 0; i < halfway; i++) {
            while (right < arr.length && arr[right] * 5 <= arr[i]) {
                right++;
            }
            count += (right - halfway);
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {10, 2, 2, 1};

        System.out.println(dominantPairs(arr));
    }
}



/**
 * idea: one tracks, one moves to check condition 
 * the check conditioner becomes the count itself and then you offload it to count after loop
 * then you reset and iterate again while moving the tracker 
 */