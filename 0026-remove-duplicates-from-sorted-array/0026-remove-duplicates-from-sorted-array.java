class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        if(nums.length==1){
            return 1;
        }

        int n=nums.length;


        for(int j=1;j<n;j++){
            if(nums[j]!=nums[i]){
                nums[++i]=nums[j];
            }
        }

        return i+1;
    }
}