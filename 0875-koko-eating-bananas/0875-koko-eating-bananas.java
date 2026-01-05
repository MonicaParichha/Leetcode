class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int ans=0;
        int r=maxElement(piles);
        while(l<=r){
            int m=l+(r-l)/2;
            int totalhours=totalHours(piles,m);
            if(totalhours<=h){
                ans=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
    public int totalHours(int [] arr, int speed){
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            ans+=Math.ceil((double)arr[i]/speed);
        }
        return ans;
    }


    public int maxElement(int[] arr){
        int ans=Integer.MIN_VALUE;
        for(int n: arr){
            ans=Math.max(ans,n);
        }
        return ans;
    }
}