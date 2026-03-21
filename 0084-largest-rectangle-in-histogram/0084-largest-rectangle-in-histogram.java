class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int maxArea=0;
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && (i==n || heights[i]<=heights[st.peek()])){
                int num=heights[st.pop()];
                int pse=st.isEmpty()? -1: st.peek();
                int nse=(i==n)?n:i;

                maxArea=Math.max(maxArea, (nse-pse-1)*num);
            }
            st.push(i);

        }
        return maxArea;
    }
}