class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    public int atMost(int[] nums,int k){
        if(k<0) return 0;
        int n=nums.length;
        int l=0,r=0;
        int count=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        while(r<n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            
            if(map.get(nums[r])==1) k--;
            
            while(k<0){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0) k++;
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
}