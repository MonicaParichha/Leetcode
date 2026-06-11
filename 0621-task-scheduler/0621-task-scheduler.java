class Solution {
    public int leastInterval(char[] tasks, int n) {
      int totaltasks=tasks.length;
      HashMap<Character, Integer> map=new HashMap<>();
      
      for(int i=0;i<totaltasks;i++){
        map.put(tasks[i], map.getOrDefault(tasks[i],0)+1);
      }
      
      int maxCount=0;
      int maxFreq=0;
      
      for(Map.Entry<Character, Integer> entry: map.entrySet()){
        maxFreq=Math.max(maxFreq,entry.getValue());
      }
      for(Map.Entry<Character, Integer> entry: map.entrySet()){
        if(entry.getValue()==maxFreq) maxCount++;
      }

      int framelength= ((maxFreq-1)*(n+1)) + maxCount;
      
      return Math.max(framelength,totaltasks);

    }
}
