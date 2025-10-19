class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        int n=nums.length;
        while(i<n && nums[i]!=0){
            i++;
        }
        while(j<n && i<n){
            if(nums[j]!=0 && nums[i]==0 && i<j){
                nums[i]=nums[j];
                nums[j]=0;
                i++;
            }
            j++;
        }
    }
}