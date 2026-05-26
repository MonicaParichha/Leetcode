class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> temp=pascal(i);
            ans.add(temp);
        }
        return ans;
    }

    public List<Integer> pascal(int n){
        List<Integer> ans=new ArrayList<Integer>();
        ans.add(1);
        int num=1;
        for(int i=1;i<n;i++){
            num=(num*(n-i))/i;
            ans.add(num);
        }
        return ans;
    }
}