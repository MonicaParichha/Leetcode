class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int[] vis=new int[n+1];
        for(int i=0;i<n;i++){
            vis[nums[i]]++;
        }

        for(int i=1;i<n;i++){
            if(vis[i]>1) return i;
        }

        return -1;
    }
}