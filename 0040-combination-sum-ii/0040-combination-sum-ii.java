class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        int n=candidates.length;
        List<Integer> arr=new ArrayList<>();
        combine(0,arr,ans,candidates,target,n);
        return ans;
    }
    public void combine(int ind, List<Integer> arr, List<List<Integer>> ans,int[] candidates,int target, int n){
        if(target==0){
            ans.add(new ArrayList<>(arr));
            return;
        }
        
        if(ind==n){
            return;
        }

        for(int i=ind;i<n;i++){
            if(i>ind && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            
            arr.add(candidates[i]);
            combine(i+1,arr,ans,candidates,target-candidates[i],n);
            arr.remove(arr.size()-1);
        }

        
    }
}