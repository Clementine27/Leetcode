class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = []
        for l in range(len(nums)-1): 
            r = len(nums)-1
            m = l + 1 
            while m < r: 
                cur = nums[l] + nums[m] + nums[r]
                if cur ==0 and [nums[l], nums[m], nums[r]] not in result: 
                    result.append([nums[l], nums[m], nums[r]]) 
                    m += 1
                    r -= 1
                elif cur < 0: 
                    m +=1 
                else: 
                    r -=1
        return result