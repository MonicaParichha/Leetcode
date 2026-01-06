class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int l=getMaxValue(weights);
        int r=getMaxWeight(weights);
        int ans=0;
        while(l<=r){
            int m=l+(r-l)/2;
            boolean isPossible = isPortable(weights,m,days);
            if(isPossible){
                ans=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
    }

    public boolean isPortable(int[] arr, int cap, int d){
        int sum=0;
        int days=1;
        for(int a: arr){
            sum+=a;
            if(sum>cap){
                days++;
                sum=a;
            }
        }
        return days<=d;
    }

    public int getMaxWeight(int [] arr){
        int ans=0;
        for(int n: arr){
            ans+=n;
        }
        return ans;
    }
    public int getMaxValue(int [] arr){
        int ans=Integer.MIN_VALUE;
        for(int n: arr){
            ans=Math.max(n,ans);
        }
        return ans;
    }
}