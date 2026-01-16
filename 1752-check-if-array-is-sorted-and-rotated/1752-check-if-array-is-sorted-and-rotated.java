class Solution {
    public boolean check(int[] nums) {
        int c=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                c++;
            }
        }
        return c==0 || (c==1 && nums[0]>=nums[n-1]);
    }
}