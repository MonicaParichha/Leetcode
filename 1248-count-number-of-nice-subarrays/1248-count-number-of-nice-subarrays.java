class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]&1;
        }
        return sumLessThanEquals(nums,k)-sumLessThanEquals(nums,k-1);
    }
    public int sumLessThanEquals(int[] nums, int k){
       if(k<0) return 0;
        int count=0;
        int sum=0,l=0,r=0;
        int n=nums.length;
        while(r<n){
            sum+=nums[r];
            while(sum>k){
                sum-=nums[l];
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
}