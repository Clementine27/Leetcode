class Solution(object):
    def dailyTemperatures(self, temperatures):
        """
        :type temperatures: List[int]
        :rtype: List[int]
        """
        result = [0]*len(temperatures)
        stack = [] 
        for i, el in enumerate(temperatures): 
            while stack and el > stack[-1][0]: 
                stackEl, stackI = stack.pop()
                result[stackI] = i-stackI
            # stack.append([el,])
            stack.append([el, i])
            
        return result
