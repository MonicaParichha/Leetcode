class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;

        if(n%groupSize!=0) return false;

        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(hand[i], map.getOrDefault(hand[i],0)+1);
        }

        int m=map.size();

        while(!map.isEmpty()){
            int min=Collections.min(map.keySet());
            map.put(min,map.get(min)-1);
            if(map.get(min)==0){
                map.remove(min);
            }
            for(int i=1;i<groupSize;i++){
                if(map.containsKey(min+i)){
                    map.put(min+i,map.get(min+i)-1);
                    if(map.get(min+i)==0){
                        map.remove(min+i);
                    }
                }else{
                    return false;
                }
            }
        }
        
        return map.isEmpty();
    }
}