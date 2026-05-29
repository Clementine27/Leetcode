

import java.util.HashSet; 
public class containsDuplicate{
    public static boolean containDups(int[] nums){
        HashSet<Integer> seen = new HashSet<Integer>(); 
        
        for (int i = 0; i < nums.length; i++){
            if (seen.contains(nums[i])){
                return true; 
            }
            else{
                seen.add(nums[i]); 
            }
        }
        return false; 
    }
}