class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        A = []
        for i, num in enumerate(nums): 
            A.append([num, i])
        A.sort()
        l = 0 
        r = len(nums)-1
        while l < r: 
            cursum = A[l][0] + A[r][0] 
            if cursum == target: 
                return [
                    min(A[l][1],A[r][1]), 
                    max(A[l][1],A[r][1])
                ]
            elif cursum > target: 
                r-=1
            else: 
                l+=1
        # return []