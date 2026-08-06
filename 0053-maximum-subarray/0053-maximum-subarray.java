class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int maxSum=0;
        int len=0;
        int maxLen=0;
        int maxEle=nums[0];

        for(int i=0;i<n;i++){
            maxEle=Math.max(maxEle,nums[i]);
            sum+=nums[i];
            if(sum<0){
                sum=0;
                len=0;
            }
            maxSum=Math.max(sum,maxSum);
            maxLen=Math.max(len,maxLen);
        }
        if(maxEle<0) return maxEle;
        return maxSum;
    }
}