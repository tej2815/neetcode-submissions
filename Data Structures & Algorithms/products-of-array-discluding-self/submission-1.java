class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] answer=new int[n];
        // for(int i=0;i<n;i++){
        //     int pro=1;
        //     for(int j=0;j<n;j++){
        //         while(i!=j){
        //             pro=pro*nums[j];
        //         }
        //     }
        //     answer[i]=pro;
        // }
        // return answer;
        int pre=1;
        for(int i=0;i<n;i++){
            answer[i]=pre;
            pre*=nums[i];
        }
        int suf=1;
        for(int i=n-1;i>=0;i--){
            answer[i]*=suf;
            suf*=nums[i];
        }
        return answer;
    }
}