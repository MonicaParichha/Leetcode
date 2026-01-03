class Solution {
    public int search(int[] nums, int target) {

        //Always find the sorted half
        int n=nums.length;
        int l=0,r=n-1, ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target){
                return m;
            }
            //left sorted
            if(nums[m]>=nums[l]){
                if(nums[l]<=target && nums[m]>target){
                    r=m-1;
                }else{
                    l=m+1;
                }
            }
            //right sorted
            else{
                if(nums[m]<target && nums[r]>=target){
                    l=m+1;
                }
                else{
                    r=m-1;
                }
            }
        }
        return -1;
    }
}