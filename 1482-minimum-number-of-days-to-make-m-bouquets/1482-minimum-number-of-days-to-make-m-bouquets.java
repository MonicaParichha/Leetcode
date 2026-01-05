class Solution {
    

    public int minDays(int[] bloomDay, int m, int k) {
        // m >> bouquets
        // k >> adjecent flowers
        // n flowers
        int n=bloomDay.length;
        if(m*k>n){
            return -1;
        }
        int l=1;
        int r=maxEle(bloomDay);
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            boolean isFeasible= isFeasibleDay(bloomDay,mid,k,m);
            if(isFeasible){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean isFeasibleDay(int [] arr, int n, int k, int m){
        
        int count=0;
        int len=arr.length;
        int bouquets=0;
        for(int i=0;i<len;i++){
            if(n>=arr[i]){
                count++;
                if(count==k){
                    bouquets++;
                    count=0;
                }
            }else{
                count=0;
            }
        }
        return bouquets>=m;
    }
    public int maxEle(int [] arr){
        int ans=Integer.MIN_VALUE;
        for(int n: arr){
            ans=Math.max(ans,n);
        }
        return ans;
    }
}