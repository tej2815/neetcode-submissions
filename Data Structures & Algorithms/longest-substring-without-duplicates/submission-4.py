class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        maxi=0
        n=len(s)
        for i in range(n):
            seen=set()
            for j in range(i,n):
                if s[j] in seen:
                    break
                seen.add(s[j])
                maxi=max(maxi,j-i+1)
        return maxi