class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        long N=n;
        boolean positive= N>0?true:false;
        N=Math.abs(N);
        while(N>0){
            if(N%2!=0){
                ans=ans*x;
            }
            x=x*x;
            N=N/2;
        }
        if(!positive) ans=1.0/ans;

        return ans;
    }
}