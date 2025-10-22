class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<2){
            return nums.length;
        }
       
        HashSet<Integer> set=new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int count=0;
        int maxCount=1;
        for(int num: set){
            if(!set.contains(num-1)){
                while(set.contains(num)){
                    count++;
                    num+=1;
                }
                
            }
                maxCount=Math.max(maxCount,count);
                count=0;
        }
        maxCount=Math.max(maxCount,count);

        return maxCount;
    }
}