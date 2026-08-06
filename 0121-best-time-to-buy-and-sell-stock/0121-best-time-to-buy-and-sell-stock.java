class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=prices[0];
        int ans=0;
        for(int i=0;i<n;i++){
            min=Math.min(prices[i],min);
            ans=Math.max(ans,prices[i]-min);
        }
        return ans;
    }
}