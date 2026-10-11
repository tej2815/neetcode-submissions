class Solution:
    def maxArea(self, heights: List[int]) -> int:
        maxi=0
        n=len(heights)
        # for i in range(n):
        #     for j in range(i+1,n):
        #         area=min(heights[i],heights[j])*(j-i)
        #         maxi=max(maxi,area)
        left=0
        right=n-1
        while left<right:
            width=right-left
            height=min(heights[left],heights[right])
            area=width*height
            maxi=max(maxi,area)
            if heights[left]<heights[right]:
                left+=1
            else:
                right-=1
        return maxi