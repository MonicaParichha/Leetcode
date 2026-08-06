class Solution {
    public int smallestNumber(int n, int t) {
        int rem=n%10;
        if(rem==0) return n;
        while(product(n)%t!=0){
            n++;
        }
        return n;
    }
    public int product(int n){
        int ans=1;
        while(n>0){
            int rem=n%10;
            ans*=rem;
            n/=10;
        }
        return ans;
    }
}