class Solution {
    public void setZeroes(int[][] matrix) {
        int col0=1;
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j==0){
                        col0=0;
                    }else{
                        matrix[0][j]=0;
                    }
                }
            }
        }
        for(int row=1;row<rows;row++){
            if(matrix[row][0]==0){
                for(int i=1;i<cols;i++){
                    matrix[row][i]=0;                   
                }
            }
        }
        for(int col=1;col<cols;col++){
            if(matrix[0][col]==0){
                for(int i=1;i<rows;i++){
                    matrix[i][col]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int i=0;i<cols;i++){
                matrix[0][i]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<rows;i++){
                matrix[i][0]=0;
            }
        }
    }
}