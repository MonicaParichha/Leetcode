class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans=0;
        int i=0;
        int j=n-1;
        while(i<j){
            ans=Math.max(nums[i]+nums[j],ans);
            i++;
            j--;
        }
        return ans;
    }
}