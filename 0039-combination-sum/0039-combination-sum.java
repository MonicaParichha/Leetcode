class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        combine(0,arr,ans,candidates,target,n);
        return ans;
    }
    public void combine(int ind,List<Integer> arr, List<List<Integer>> ans,int[] candidates, int target, int n){
        if(ind==n){
            if(target==0){
                List<Integer> temp=new ArrayList<>(arr);
                ans.add(temp);
            }
            return;
        }
        if(candidates[ind]<=target){
            arr.add(candidates[ind]);
            combine(ind,arr,ans,candidates,target-candidates[ind],n);
            arr.remove(arr.size()-1);
        }
        combine(ind+1,arr,ans,candidates,target,n);
    }
}