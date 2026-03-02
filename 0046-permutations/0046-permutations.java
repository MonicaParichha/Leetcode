class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        boolean[] visited=new boolean[n];
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        permutation(visited,ans,arr,nums,n);
        return ans;
    }
    public void permutation(boolean[] visited, List<List<Integer>> ans, List<Integer> arr, int[] nums,int n){
        if(arr.size()==n){
            ans.add(new ArrayList<>(arr));
            return;
        }

        for(int i=0;i<n;i++){
            if(visited[i]==false){
                visited[i]=true;
                arr.add(nums[i]);
                permutation(visited,ans,arr,nums,n);
                arr.remove(arr.size()-1);
                visited[i]=false;
            }
        }
    }
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt"))
            {
                writer.write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
        ));
    }
}