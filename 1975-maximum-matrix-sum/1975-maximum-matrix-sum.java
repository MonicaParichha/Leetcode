class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int countNeg=0;
        int minEle=Integer.MAX_VALUE;
        long sum=0;
        for(int [] mat: matrix){
            for(int n: mat){
                if(n<0){
                    countNeg++;
                }
                sum+=Math.abs(n);
                minEle=Math.min(minEle,Math.abs(n));
                
            }
        }
       
        if(countNeg%2!=0){
            sum-=(2L*minEle);
        }
        return sum;
        
    }
}