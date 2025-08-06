class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int ans=0;
        int max=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            max=Math.max(nums[i],max);
        }
        if(max<0){
            return max;
        }
        for(int i=0;i<n;i++){
            sum+=nums[i];
            ans=Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}