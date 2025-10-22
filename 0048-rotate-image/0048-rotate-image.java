class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int [] arr: matrix){
            reverse(arr);
        }        
    }

    public void transpose(int [][] matrix){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public void reverse(int[] arr){
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