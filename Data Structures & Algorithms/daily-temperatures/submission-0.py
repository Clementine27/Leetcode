class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        hot = [0]*len(temperatures)
        stack = []
        for i, t in enumerate(temperatures): 
            while stack and t > stack[-1][0]: 
                pos = stack[-1][1]
                hot[pos] = i - stack[-1][1]
                stack.pop()
            stack.append([t, i])
        return hot 
