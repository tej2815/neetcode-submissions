class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        // int left=0;
        // int right=n-1;
        // while(left<=right){
        //     int mid=left+right/2;
        //     if(nums[mid]==target){
        //         return mid;
        //     }else if(nums[mid]<target){
        //         left=mid+1;
        //     }else{
        //         mid=right-1;
        //     }
        // }
        // return -1;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
