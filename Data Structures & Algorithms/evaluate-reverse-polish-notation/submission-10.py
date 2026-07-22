class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        operators = {"+", "-", "*", "/"}
        for t in tokens: 
            if t not in operators: 
                stack.append(int(t))
            elif t == '+': 
                result = stack.pop() + stack.pop()
                stack.append(result)
            elif t == '-': 
                result = -stack.pop() + stack.pop()
                stack.append(result)
            elif t == '*': 
                result = stack.pop() * stack.pop()
                stack.append(result)
            else: 
                divider = stack.pop()
                beingDevided = stack.pop()
                if divider !=0: 
                    result = beingDevided/divider
                else: 
                    result = 0 
                stack.append(int(result))
        return stack.pop()
