class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=0;
        int sum=0;
        int n=nums.length;
        int maxele=Integer.MIN_VALUE;
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n;i++){
            sum+=nums[i];
            maxSum=Math.max(maxSum,sum);
            maxele=Math.max(nums[i],maxele);
            if(sum<0){
                sum=0;
            }
        }
        if(maxele<0){
            return maxele;
        }
        
        return maxSum;
    }
}