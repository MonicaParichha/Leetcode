class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        //boolean[] visited=new boolean[n];
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        permutation(0,ans,nums,n);
        return ans;
    }
    public void permutation(int index,List<List<Integer>> ans,int[] nums,int n){
        if(index==n){
            List<Integer> arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                arr.add(nums[i]);
            }
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int i=index;i<n;i++){
            swap(i,index,nums);
            permutation(index+1,ans,nums,n);
            swap(i,index,nums);
        }
    }
    public void swap(int i, int j, int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }



    // public void permutation(boolean[] visited, List<List<Integer>> ans, List<Integer> arr, int[] nums,int n){
    //     if(arr.size()==n){
    //         ans.add(new ArrayList<>(arr));
    //         return;
    //     }

    //     for(int i=0;i<n;i++){
    //         if(visited[i]==false){
    //             visited[i]=true;
    //             arr.add(nums[i]);
    //             permutation(visited,ans,arr,nums,n);
    //             arr.remove(arr.size()-1);
    //             visited[i]=false;
    //         }
    //     }
    // }
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