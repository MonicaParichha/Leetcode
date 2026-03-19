class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[nums2.length];
        int n=nums2.length;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()) ans[i]=-1;
            else ans[i]=st.peek();
            st.push(nums2[i]);
        }
        int[] nge=new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]) nge[i]=ans[j];
            }
        }
        return nge;
        
    }
}