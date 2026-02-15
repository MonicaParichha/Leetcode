class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=bulbs.size();
        for(int i=0;i<n;i++){
            map.put(bulbs.get(i),map.getOrDefault(bulbs.get(i),0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()%2!=0){
                ans.add(entry.getKey());
            }
        }
        Collections.sort(ans);
        return ans;
    }
}