class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int n=heights.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int area=Math.min(heights[i],heights[j])*(j-i);
                max=Math.max(max,area);
            }
        }
        return max;
    }
}
