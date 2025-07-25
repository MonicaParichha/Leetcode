class Solution {
    public int maxSum(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }

        boolean isNegative=true;
        int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        int i=0;
        int sum=0;
        int n=nums.length;
        for(int j=1;j<n;j++){
            if(nums[i]!=nums[j]){
                nums[++i]=nums[j];
            }
            if(nums[j]>0){
                isNegative=false;
            }
            max=Math.max(nums[j],max);
        }
        if(isNegative){
            return max;
        }

        for(int j=0;j<i+1;j++){
            if(nums[j]>0){
                sum+=nums[j];
            }
        }

        return sum;

    }
}