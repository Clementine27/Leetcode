package collision; 

import java.util.Arrays;

/**
 * Given a 1-indexed array of integers numbers sorted in non-decreasing order, 
 * find two numbers such that they add up to a specific target number. 
 * Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers index1 and index2, 
each incremented by one, as an integer array [index1, index2] of length 2.

not use the same element twice.
constant extra space. 

Example 1:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
 */
public class TwoSums167{
    public static String solution(int[] numbers, int target){
        int left = 0; 
        int right = numbers.length-1; 
        for (int i = 0; i < numbers.length; i++){

            if (numbers[left] + numbers[right] == target){
                int[] answer = new int[] {left + 1, right + 1 };
                return Arrays.toString(answer); 
            }
            else if  (numbers[left] + numbers[right] < target){
                left++; 
            }
            else {
                right--; 
            }
        }

        return ""; 
    }  
    
    public static void main(String[] args){
        int[] input = new int[] {2,3,4}; 
        int  target = 6; 

        System.out.println(solution(input, target)); 
    }
}