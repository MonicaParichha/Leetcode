class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int l=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=nums[l]){
                l++;
                nums[l]=nums[i];
            }
        }
        return l+1;
    }
}