class Solution {
    public int singleNonDuplicate(int[] nums) {

        // 1 1 2 2 3 3 4 4 5 5 6  7  7
        // 0 1 2 3 4 5 6 7 8 9 10 11 12
        // e o e o e o e o e o  e  o  e  
        // case 1: before single element --> repeating numbers are at index -> e,o 
        // case 2: after single element --> repeating numbers are at index -> o,e

        int n=nums.length;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        int l=1,r=n-2;


        while(l<=r){
            int m=l+(r-l)/2;
            //single element found
            if(nums[m]!=nums[m-1] && nums[m]!=nums[m+1]){
                return nums[m];
            }
            // case 2 --> o,e
            if((m%2==0 && nums[m]==nums[m-1]) || (m%2!=0 && nums[m]==nums[m+1])){
                r=m-1;
            }
            //case 1 --> e,o
            else if((m%2==0 && nums[m]==nums[m+1]) || (m%2!=0 && nums[m]==nums[m-1])){
                l=m+1;
            }
        }
        return -1;
        
    }
}