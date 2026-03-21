class Solution {
    public int maximalRectangle(char[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][] mat=new int[rows][cols];
        for(int i=0;i<cols;i++){
            int sum=0;
            for(int j=0;j<rows;j++){
                sum+=(matrix[j][i]-'0');
                if(matrix[j][i]-'0'==0) sum=0;
                mat[j][i]=sum;
            }
        }
        int max=0;
        for(int [] r:mat){
            max=Math.max(max,largestRectangleArea(r));
        }
        return max;
    }
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