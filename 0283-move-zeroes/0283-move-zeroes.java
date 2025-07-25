class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        int n=nums.length;
        while(j<n){
            while(i<n && nums[i]!=0){
                i++;
            }
            if(nums[j]!=0 && i<j){
                nums[i]=nums[j];
                nums[j]=0;
            }
            j++;
        }
    }
}