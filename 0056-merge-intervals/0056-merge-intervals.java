class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b)->Integer.compare(a[0], b[0]));
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int n=intervals.length;

        for(int i=0;i<n;i++){
            if(ans.isEmpty() || intervals[i][0]>ans.get(ans.size()-1).get(1)){
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);
                ans.add(temp);
            }else{
                int maxEnd=Math.max(intervals[i][1], ans.get(ans.size()-1).get(1));
                ans.get(ans.size()-1).set(1,maxEnd);
            }
        }
        int [][] ans1=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<2;j++){
                ans1[i][j]=ans.get(i).get(j);
            }
        }
        return ans1;
    }
}