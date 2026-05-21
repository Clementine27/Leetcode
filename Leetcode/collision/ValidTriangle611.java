package collision; 



/**
 * Given an integer array nums, 
 * return the number of triplets chosen from the array 
 * that can make triangles if we take them as side lengths of a triangle.

Example 1:
Input: nums = [2,2,3,4]
Output: 3
Explanation: Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3

Example 2:
Input: nums = [4,2,3,4]
Output: 4

 */

import java.util.Arrays;
public class ValidTriangle611{
    public static int triangleNumber(int[] arr){
        Arrays.sort(arr); 
        int count = 0; 
        // int right = arr.length -2; 
        for (int i =arr.length-1; i > 1; i--){
            int left = 0; 
            int right = i -1;
            while (left < right){
                if (arr[left] + arr[right] > arr[i]){
                    count+= right -left;
                    System.out.println("left: " + left + " right: " + right + " i : " + i); 
                    right--; 
                }
                else{
                    left++; 
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = new int[]{2,2,3,4}; 
        System.out.println(triangleNumber(arr)); 


    }
}