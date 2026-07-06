class Solution:
    def maxArea(self, heights: List[int]) -> int:
        r = len(heights)-1
        l = 0 
        maxW = 0
        while l < r: 
            w = min(heights[l], heights[r])*(r-l)
            if w > maxW: 
                maxW = w 
            if heights[l]<= heights[r]: 
                l+=1
            else: 
                r-=1
        return maxW
