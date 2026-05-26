class Solution {
    public double myPow(double x, int n) {
        
        boolean isNeg=(n<0)?true:false;
        long N=n;
        N=Math.abs(N);
        double ans= power(1.0,x,N);

        return isNeg==true? 1.0/ans: ans;
        
    }
    public double power(double ans, double x, long n){
        if(n<=0){
            return ans;
        }
        if(n%2!=0) ans=ans*x;
        x=x*x;
        return power(ans,x,n/2);

    }
}