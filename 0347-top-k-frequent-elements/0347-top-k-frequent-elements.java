class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->Integer.compare(b.c,a.c));
        
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }

        int[] ans=new int[k];

        for(int i=0;i<k;i++){
            Pair p=pq.poll();
            ans[i]=p.n;
        }
        return ans;
    }
}
class Pair{
    int n;
    int c;
    Pair(int n, int c){
        this.n=n;
        this.c=c;
    }
}