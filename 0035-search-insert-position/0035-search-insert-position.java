class Solution {
    public int searchInsert(int[] nums, int target) {
        // arr[i]>=target
        int n=nums.length;
        int l=0;
        int r=n-1;
        int ans=n;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]>=target){
                r=m-1;
                ans=m;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
}