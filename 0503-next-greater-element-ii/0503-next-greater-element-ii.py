class Solution(object):
    def nextGreaterElements(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        stack = []
        result = [-1]*len(nums)
        for j in range(2): 
            for i in range(len(nums)): 
                while stack and nums[i] > nums[stack[-1]]: 
                    result[stack[-1]] = nums[i]
                    stack.pop()
                stack.append(i)

        # for j in range(len(nums)): 
        #     while nums[j] > nums[stack[-1]]: 
        #         result[stack[-1]] = nums[j]
        #         stack.pop()

        return result 