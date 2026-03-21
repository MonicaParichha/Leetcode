class Solution {
    public long subArrayRanges(int[] nums) {
        long min=sumSubarrayMins(nums);
        long max=sumSubarrayMaxs(nums);

        return max-min;
    
    }
    public long sumSubarrayMaxs(int[] arr) {
        int n=arr.length;
        long total=0;
        
        int[] nge=nge(arr);
        int[] pgee=pgee(arr);
        for(int i=0;i<n;i++){
            long left=i-pgee[i];
            long right=nge[i]-i;
            long freq= left*right*arr[i];
            
            total+=freq;
        }
        return total;
    }

    public long sumSubarrayMins(int[] arr) {
        int n=arr.length;
        long total=0;
        
        int[] nse=nse(arr);
        int[] psee=psee(arr);
        for(int i=0;i<n;i++){
            long left=i-psee[i];
            long right=nse[i]-i;
            long freq= left*right*arr[i];
            
            total+=freq;
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
    public int[] nge(int [] arr){
        int n=arr.length;
        int [] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            ans[i]=!st.isEmpty()? st.peek() : n;
            st.push(i); // index
        }
        return ans;
    }
    public int[] pgee(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]< arr[i]){
                st.pop();
            }
            ans[i]=!st.isEmpty()?st.peek():-1;

            st.push(i);
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