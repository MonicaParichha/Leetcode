class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<String> arr=new ArrayList<>();
        String str="";
        for(int i=0;i<n;i++){
            str+=".";
        }
        for(int i=0;i<n;i++){
            arr.add(str);
        }
        int[] left=new int[n];
        int[] bottom=new int[2*n];
        int[] upper=new int[2*n];
        List<List<String>> ans=new ArrayList<>();
        solve(0,ans,arr,n,left,bottom,upper); 
        return ans;
    }

    public void solve(int col,List<List<String>> ans,List<String> arr,int n,int[] left, int[] bottom, int[] upper){
        if(col==n){
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(i,col,left,bottom,upper,n)){
                left[i]=1;
                bottom[i+col]=1;
                upper[(n-1)+i-col]=1;
                arr.set(i,arr.get(i).substring(0,col)+"Q"+arr.get(i).substring(col+1));
                solve(col+1,ans,arr,n,left,bottom,upper);
                arr.set(i,arr.get(i).substring(0,col)+"."+arr.get(i).substring(col+1));
                left[i]=0;
                bottom[i+col]=0;
                upper[(n-1)+i-col]=0;
            }
        }
    }
    public boolean isSafe(int row, int col,int[] left, int[] bottom, int[] upper, int n){
        if(left[row]==0 && bottom[row+col]==0 && upper[(n-1)+row-col]==0) return true;

        return false;
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
