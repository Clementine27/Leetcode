/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

 */


import java.util.Arrays; 
import java.util.HashMap; 
public class TwoSums {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> oriNums = new HashMap<Integer, Integer>(); 
        for (int i=0; i < nums.length; i++){
            oriNums.put(nums[i], i); 
        } 
        System.out.println(oriNums);

        Arrays.sort(nums); 
        // System.out.println(Arrays.toString(nums)); 
        int r = nums.length -1; 
        int l = 0; 
        while (l < r){
            int tsum = nums[l] + nums[r]; 
            // System.out.println(tsum); 
            // System.out.println("l: " + l + " r: " + r); 
            


            if (tsum == target){
                // System.out.println("l: " + l + " r: " + r); 
                int left = oriNums.get(nums[l]); 
                int right = oriNums.get(nums[r]); 
                            System.out.println("l: " + left + " r: " + right); 

                return new int[]{left, right}; 
            }
            else if (tsum > target){
                r--; 
            }
            else{
                l++; 
            }
            // }
        }
        // System.out.println("not found "); 
        return new int[]{-1, -1}; 
}



    public static int[] answer(int[] nums, int target){
        HashMap<Integer, Integer> record = new HashMap<Integer, Integer>(); 
        for (int i = 0; i < nums.length; i++){
            int runningMate = target - nums[i]; 
            if (record.containsKey(runningMate)){
                return new int[]{record.get(runningMate), i }; 
            }
            else{
                record.put(nums[i], i); 
            }

        }
        return new int[]{}; 
    }

        public static void main(String[] args)
    {
        int[] arr = new int[]{ 3,3 };
        // System.out.println(twoSum(arr, 6)); 
        
    }

}


