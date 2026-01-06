class Solution {

    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int[] arr=getMinMax(nums);
        int l=arr[0];
        int r=arr[1];
        int ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            int sum=getSum(nums,m);
            if(sum<=threshold){
                ans=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
    public int getSum(int [] arr, int d){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)arr[i]/d);
        }
        return sum;
    }
    public int[] getMinMax(int [] arr){
        int [] ans=new int[2];
        for(int num: arr){
            ans[0]=Math.min(ans[0],num);
            ans[1]=Math.max(ans[1],num); 
        }
        return ans;
    }
}