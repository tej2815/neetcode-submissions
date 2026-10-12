class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        n=len(heights)
        maxarea=0
        for i in range(n):
            mini=heights[i]
            for j in range(i,n):
                mini=min(mini,heights[j])
                width=j-i+1
                area=width*mini
                maxarea=max(maxarea,area)
        return maxarea