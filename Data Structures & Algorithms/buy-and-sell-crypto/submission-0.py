class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        n=len(prices)
        m=0
        mi=prices[0]
        # for i in range(n):
        #     for j in range(i+1,n):
        #         profit=prices[j]-prices[i]
        #         m=max(m,profit)
        # return m
        for i in prices[1:]:
            if i <mi:
                mi=i
            else:
                m=max(m,i-mi)
        return m