class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> temp=getNthRow(i);
            ans.add(temp);
        }
        return ans;
    }
    public List<Integer> getNthRow(int rows){
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        int ans=1;
        for(int i=1;i<rows;i++){
            ans=(ans*(rows-i))/i;
            arr.add(ans);
        }
        return arr;
    }
}