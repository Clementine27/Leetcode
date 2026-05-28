package collision;
/**
 * Given an integer array nums, 
 * return all the triplets [nums[i], nums[j], nums[k]] 
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

 */


import java.util.Arrays; 
public class ThreeSum15{
    public static int sumsThree(int[] arr){
        int count = 0; 

        Arrays.sort(arr); 
        System.out.println(Arrays.toString(arr)); 

        for (int i =0; i < arr.length-2; i++){
            if ( i >=1 && arr[i] == arr[i-1]) continue; 

            int right = arr.length-1; 
            int left = i +1; 

            while (left < right){
                System.out.println(" i : " + arr[i] + "left: " + arr[left] + " right: " + arr[right]); 

                if (arr[i] + arr[left] + arr[right] ==0){
                    count++; 
                    left++; 
                    while ( left < right && arr[left] == arr[left-1]) left++; 
                    while ( left < right && arr[right] == arr[right-1]) right--; 


                }
                else if (arr[i] + arr[left] + arr[right] > 0){
                    right --; 
                }
                else if (arr[i] + arr[left] + arr[right] < 0){
                    left ++; 
                }
            }; 

        }; 

        return count; 
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,1,2,-1,-4}; 
        System.out.println(sumsThree(arr)); 
    }
}