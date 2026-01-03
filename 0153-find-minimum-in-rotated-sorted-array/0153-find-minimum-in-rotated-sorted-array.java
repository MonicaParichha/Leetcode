class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1,ans=Integer.MAX_VALUE;
        while(l<=r){
            int m=l+(r-l)/2;
            //array is sorted
            if(nums[l]<nums[r]){
                ans=Math.min(ans,nums[l]);
                return ans;
            }
            //left sorted
            if(nums[l]<=nums[m]){
                ans=Math.min(ans,nums[l]);
                l=m+1;
            }
            //right sorted
            else{
                ans=Math.min(ans,nums[m]);
                r=m-1;
            }
        }
        return ans;
    }
}