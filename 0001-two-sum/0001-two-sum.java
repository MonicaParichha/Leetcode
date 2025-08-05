class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]+nums[i]==target){
                    return new int[]{j,i};
                }
            }
        }
        return new int[]{-1,-1};


        //Approach 2: Using Hashing
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     if(!map.containsKey(target-nums[i])){
        //         map.put(nums[i],i);
        //     }else{
        //         return new int[]{map.get(target-nums[i]), i};
        //     }
        // }
    }
}