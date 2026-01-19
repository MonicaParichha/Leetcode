class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxSum=0;
        int maxEle=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            maxSum=Math.max(sum,maxSum);
            maxEle=Math.max(nums[i],maxEle);
            if(sum<0){
                sum=0;
            }
        }
        if(maxEle<0){
            return maxEle;
        }
        return maxSum;
    }
}