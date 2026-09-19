class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        int n=prices.length;
        // for (int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int profit=prices[j]-prices[i];
        //         max=Math.max(max,profit);
        //     }
        // }
        // return max;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }else{
                max=Math.max(max,prices[i]-min);
            }
        }
        return max;
    }
}