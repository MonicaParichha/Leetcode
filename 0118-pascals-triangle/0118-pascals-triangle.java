class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> temp= pascal(i);
            ans.add(temp);
        }
        return ans;
    }
    public List<Integer> pascal(int n){
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        int ans=1;
        for(int i=1;i<n;i++){
            ans = (ans*(n-i))/i;
            arr.add(ans);
        }
        return arr;
    }
}