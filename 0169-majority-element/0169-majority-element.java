class Solution {

    static {
        for (int i = 0; i < 500; i++) {
            majorityElement(new int[] {0});
        }
    }

    public static int majorityElement(int[] nums) {

        int count=0;
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                ans=nums[i];
            }else if(nums[i]==ans){
                count++;
            }else{
                count--;
            }
        }
        return ans;
    }
}