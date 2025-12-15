class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(rowElements(i));
        }
        return ans;
    }

    public List<Integer> rowElements(int row){
        int ans=1;
        List<Integer> rowEle=new ArrayList<>();
        rowEle.add(1);
        for(int i=1;i<row;i++){
            ans=ans*(row-i);
            ans/=i;
            rowEle.add(ans);
        }
        return rowEle;
    }
}