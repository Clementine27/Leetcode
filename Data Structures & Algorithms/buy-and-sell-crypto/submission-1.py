class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0 
        l = 0 
        r = l + 1 
        while r <= len(prices)-1 : 
            cp = prices[r] - prices[l]
            if cp <= 0: 
                l = r 
            elif cp > 0 and cp > profit: 
                profit = cp 
            r +=1 
        return profit