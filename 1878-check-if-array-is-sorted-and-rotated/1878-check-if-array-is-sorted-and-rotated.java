class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                count++;
            }
        }
        if((count==1 && nums[0]>=nums[n-1]) || count==0){
            return true;
        }
        return false;
    }
}