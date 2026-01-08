class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        if(n<k){
            return -1;
        }
        int[] range=getMinMax(nums);
        int l=range[0];
        int r=range[1];
        while(l<=r){
            int m=l+(r-l)/2;
            int count=getCount(nums,m);
            if(count>k){
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return l;
    }
    public int getCount(int [] arr, int m){
        int count=1,last=0;
        for(int a: arr){
            if(a+last<=m){
                last+=a;
            }else{
                last=a;
                count++;
            }
        }
        return count;
    }
    public int[] getMinMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int a: arr){
            sum+=a;
            max=Math.max(max,a);
        }
        return new int[] {max,sum};
    }
}