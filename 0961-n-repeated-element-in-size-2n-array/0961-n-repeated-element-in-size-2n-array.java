class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(nums[i]==nums[i+1] || nums[i]==nums[i+2]){
                return nums[i];
            }
        }
        return nums[n-1];
        
        
        
        
        
        // int n=nums.length/2;
        // HashMap<Integer, Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }

        // for(Map.Entry<Integer, Integer> entry:map.entrySet()){
        //     if(entry.getValue()==n){
        //         return entry.getKey();
        //     }
        // }
        // return -1;
    }
}