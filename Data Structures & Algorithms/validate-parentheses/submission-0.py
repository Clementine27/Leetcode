class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        paraDict = {')': '(', ']': '[', '}': '{'}
        for el in s: 
            if el in paraDict: 
                if stack and stack[-1] == paraDict[el]: 
                    stack.pop()
                else: 
                    return False 
            else: 
                stack.append(el)
        return not stack
