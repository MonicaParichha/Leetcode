class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        int n=nums.length;
        generateSubsets(0,temp,nums,n,ans);
        return ans;
        
    }
     public void generateSubsets(int ind, List<Integer> temp, int[] arr, int n,List<List<Integer>> ans){
        ans.add(new ArrayList<>(temp));
        
        for(int i=ind;i<n;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            
            temp.add(arr[i]);
            generateSubsets(i+1,temp,arr,n,ans);
            temp.remove(temp.size()-1);
           
        }
        
    }
}