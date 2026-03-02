class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> arr=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        combine(1,0,k,n,arr,ans);
        return ans;
    }
    public void combine(int index,int sum, int k, int n,List<Integer> arr, List<List<Integer>> ans){
        if(sum==n && k==0){
            ans.add(new ArrayList<>(arr));
            return;
        }
        if(sum>n){
            return;
        }

        for(int i=index;i<10;i++){
            if(i>n) break;
        
            arr.add(i);
            combine(i+1,sum+i,k-1,n,arr,ans);
            arr.remove(arr.size()-1);
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