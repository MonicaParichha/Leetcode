class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int l=0,r=n-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target){
                return true;
            }
            else if(nums[l]==nums[m] && nums[m]==nums[r]){
                l++;
                r--;
                continue;
            }
            //left sorted
            else if(nums[l]<=nums[m]){
                if(nums[l]<=target && nums[m]>target){
                    r=m-1;
                }else{
                    l=m+1;
                }
            }else{
                if(nums[m]<target && nums[r]>=target){
                    l=m+1;
                }else{
                    r=m-1;
                }
            }
        }
        return false;
    }
}