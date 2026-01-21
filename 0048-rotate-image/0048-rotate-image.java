class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int[] mat: matrix){
            rev(mat);
        }
    }
    public void transpose(int[][] mat){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
    public void rev(int[] arr){
        int n=arr.length;
        int i=0,j=n-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}