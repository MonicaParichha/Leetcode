class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int j=1;
        int n=nums.length;
        while(j<n){
            if(nums[j]!=nums[k]) nums[++k]=nums[j];
            j++;
        }
        return k+1;

    }
}