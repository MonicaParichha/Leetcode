class Solution {
    long MOD=1000000007;
    public int countGoodNumbers(long n) {
        long even=myPow(5,(n+1)/2);
        long odd=myPow(4,n/2);
        return (int)((even*odd)%MOD);
    }
    public long myPow(int x,long n){
        
        if(n==0) return 1;
        long half=myPow(x,n/2);
        if(n%2==0) return (half*half) % MOD;
        return (half*half*x)%MOD;
    }
}