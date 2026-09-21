class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int zero=0;
        int ptr=0;
        
        for(int i=0;i<n;i++){
            while(zero<n && nums[zero]!=0){
                zero++;
            }
            if(zero>=n-1) return;
            if(i>zero && nums[i]!=0){
                swap(nums,i,zero);
            }
        }

    }
    public void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}