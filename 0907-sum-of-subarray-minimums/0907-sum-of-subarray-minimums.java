class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int total=0;
        int mod=(int)1e9+7;
        int[] nse=nse(arr);
        int[] psee=psee(arr);
        for(int i=0;i<n;i++){
            int left=i-psee[i];
            int right=nse[i]-i;
            long freq= 1L * left*right;
            int frequency=(int)((freq*arr[i])%mod);
            total=(total+frequency)%mod;
        }
        return total;
    }
    public int[] nse(int [] arr){
        int n=arr.length;
        int [] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            ans[i]=!st.isEmpty()? st.peek() : n;
            st.push(i); // index
        }
        return ans;
    }
    public int[] psee(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]> arr[i]){
                st.pop();
            }
            ans[i]=!st.isEmpty()?st.peek():-1;

            st.push(i);
        }
        return ans;
    }
}