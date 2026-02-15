class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Map<Integer,Integer> map2=new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            map2.put(entry.getValue(),map2.getOrDefault(entry.getValue(),0)+1);
        }
        
        int ans=getUniqueKey(map2);
        
        if(ans==-1) return -1;

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue().equals(ans)){
                return entry.getKey();
            }
        }
        return -1;
        
    }
    
    public int getUniqueKey(Map<Integer,Integer> map){
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==1) return entry.getKey();
        }
        return -1;
    }
    
}