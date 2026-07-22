class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        pdict = {
            '}': '{', 
            ')': '(', 
            ']': '['
        }
        for el in s: 
            if el in pdict.values():
                stack.append(el)
            else: 
                if not stack or stack[-1] != pdict.get(el): 
                    return False 
                elif stack and stack[-1] == pdict.get(el): 
                    stack.pop()

        return len(stack) == 0 
