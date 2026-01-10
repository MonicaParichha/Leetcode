class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int l=0;
        int r=mat[0].length-1;
        while(l<=r){
            int midCol=l+(r-l)/2;
            int row=findMaxIndex(mat,midCol);
            int left= (midCol>0)?mat[row][midCol-1]:-1;
            int right=(midCol<mat[0].length-1)?mat[row][midCol+1]:-1;
            if(mat[row][midCol]>left && mat[row][midCol]>right){
                return new int[] {row,midCol};
            }
            if(mat[row][midCol]>left){
                l=midCol+1;
            }else{
                r=midCol-1;
            }
        }
        return new int[]{-1,-1};
    }
    public int findMaxIndex(int[][] arr, int col){
        int max=0;
        int index=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i][col]>max){
                max=arr[i][col];
                index=i;
            }
        }
        return index;
    }
}