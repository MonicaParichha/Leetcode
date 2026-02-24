class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> arr=new ArrayList<>();
        combine(0,arr,candidates,candidates.length,target);
        return ans;
    }
    public void combine(int index, List<Integer> arr, int[] candidates,int n, int target){
        if(target==0){
            ans.add(new ArrayList<>(arr));
            return;
        } 
        if(index==n) return;
        if(target<0) return;

        arr.add(candidates[index]);
        combine(index,arr,candidates,n,target-candidates[index]);
        arr.remove(arr.size()-1);
        combine(index+1,arr,candidates,n,target);
    }
}