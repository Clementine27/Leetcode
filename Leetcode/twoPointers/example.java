package twoPointers;


// Given a sorted array arr (sorted in ascending order) and a target, 
// find if there exists any pair of elements (arr[i], arr[j]) 
// such that their sum is equal to the target.

// Illustration : 

// Input: arr[] = [10, 20, 35, 50], target =70
// Output:  true
// Explanation : There is a pair (20, 50) with given target.

// Input: arr[] = [10, 20, 30], target =70
// Output :  false
// Explanation : There is no pair with sum 70

// Input: arr[] = [-8, 1, 4, 6, 10, 45], target = 16
// Output: true
// Explanation : There is a pair (6, 10) with given target.

public class example {
    public static boolean twoSum(int[] arr, int target){
        int left = 0; 
        int right = arr.length - 1; 

        while (left < right){
            int twoSum = arr[left] + arr[right]; 
            if (twoSum ==target){
                return true; 
            }
            else if (twoSum < target){
                left ++; 
            }
            else{
                right--; 
            }
        }
        return true; 
    }


    public static void main(String[] args){

        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;

        // Call the twoSum function and print the result
        if (twoSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
