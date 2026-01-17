class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int nsum=n*(n+1)/2;
        for(int num:nums){
            nsum-=num;
        }
        return nsum;
    }
}