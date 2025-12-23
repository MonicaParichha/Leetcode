class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            if(arr.isEmpty() || intervals[i][0] > arr.get(arr.size()-1).get(1)){
                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);
                arr.add(temp);
            }else{
                int lastIndex=arr.size()-1;
                int maxEle=Math.max(arr.get(lastIndex).get(1), intervals[i][1]);
                arr.get(lastIndex).set(1, maxEle);
            }
            
        }
        int[][] ans=new int[arr.size()][2];
        for(int i=0;i<arr.size();i++){
            ans[i][0] = arr.get(i).get(0);
            ans[i][1] = arr.get(i).get(1);
        }
        return ans;
    }
}