class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_val: int = prices[0]
        profit:int = 0
        
        for j in range(1,len(prices)):
            if min_val>prices[j]:
                min_val=prices[j]
            else:
                if profit<prices[j]-min_val:
                    profit=prices[j]-min_val

        return profit
