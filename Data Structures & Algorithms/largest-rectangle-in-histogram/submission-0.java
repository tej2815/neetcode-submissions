class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxarea=0;
        for(int i=0;i<n;i++){
            int min=heights[i];
            for(int j=i;j<n;j++){
                min=Math.min(min,heights[j]);
                int width=j-i+1;
                int area=width*min;
                maxarea=Math.max(maxarea,area);
            }
        }
        return maxarea;
    }
}
