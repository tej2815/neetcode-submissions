class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] answer=new int[n];
        for(int i=0;i<n;i++){
            int pro=1;
            for(int j=0;j<n;j++){
                while(i!=j){
                    pro=pro*nums[j];
                }
            }
            answer[i]=pro;
        }
        return answer;
    }
}