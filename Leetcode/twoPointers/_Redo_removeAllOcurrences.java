package twoPointers;

import java.util.ArrayList;

// Given an integer array arr[] and an integer ele the task is to remove all occurrences of ele from arr[] in-place 
// and return the number of elements which are not equal to ele. 
// If there are k number of elements which are not equal to ele 
// then the input array arr[] should be modified such that 
// the first k elements should contain the elements which are not equal to ele and then the remaining elements.
// Note: The order of first k elements may be changed.
// Examples:
// Input: arr[] = [3, 2, 2, 3], ele = 3
// Output: 2
// Explanation: The answer is 2 because there are 2 elements which are not equal to 3 
// and arr[] will be modified such that the first 2 elements contain the elements which are not equal to 3 
// and remaining elements can contain any element. So, modified arr[] = [2, 2, _, _]
// Input: arr[] = [0, 1, 3, 0, 2, 2, 4, 2], ele = 2
// Output: 5
// Explanation: The answer is 5 because there are 5 elements which are not equal to 2 
// and arr[] will be modified such that the first 5 elements contain the elements which are not equal to 2 and 
// remaining elements can contain any element. So, modified arr[] = [0, 1, 3, 0, 4, _, _, _]
public class _Redo_removeAllOcurrences {

    // static = this can belong to 
    // public static int removeElement(ArrayList<Integer> arr, int ele) {
    //     int count = 0;
    //     int left = 0;
    //     int right = left + 1;
    //     while (left <= arr.size() -1){
    //         if (arr.get(left) == ele){
    //             count++; 
    //             if (r)
    //         }
    //     }
    //     System.out.println(arr); 
    //     return count;
    // }
    public static int removeElement(ArrayList<Integer> arr, int ele) {
        int k = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)!= ele) {
                swap(arr, k, i);
                k++;
                // pr)                
            }
            System.out.print(arr + "\n"); 
        }
        return k;
    }

    public static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    /**
     * left = 0 
     * right = left + 1  
     * count = 0 
     * for left <= arr size -1 
     *      if arr[left] == target
     *         count ++ 
     *         if right <= arr legnth: 
         *         for right in arr[right:]:          
         *              if arr[right] != target: 
     *                      arr[left] == arr[right]
     *                      right ++ 
     *         else: 
     *              arr[left] = randomInt
     * */

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(3);
        arr.add(0);
        arr.add(2);
        arr.add(2);
        arr.add(4);
        arr.add(2);
        int ele = 2;
        System.out.print(arr + "\n"); 
        System.out.println(removeElement(arr, ele));
    }
}
