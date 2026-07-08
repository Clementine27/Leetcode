class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        stack = []
        cars = []
        for i in range(len(position)): 
            cars.append([position[i], (target - position[i])/(speed[i])])
        cars.sort(reverse = True) 
        for car in cars: 
            if not stack or car[1] > stack[-1][1]: 
                stack.append(car)
        return len(stack)