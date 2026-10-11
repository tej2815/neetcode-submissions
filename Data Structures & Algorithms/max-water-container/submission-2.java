class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int n=heights.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int area=Math.min(heights[i],heights[j])*(j-i);
        //         max=Math.max(max,area);
        //     }
        // }
        // return max;
        int left=0;
        int right=n-1;
        while(left<right){
            int width=right-left;
            int height=Math.min(heights[left],heights[right]);
            int area=width*height;
            max=Math.max(max,area);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
