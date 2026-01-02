class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstOccurance(nums,target);
        int last=lastOccurance(nums,target);
        return new int[]{first,last};
    }

    public int lastOccurance(int[] arr, int target){
        int n=arr.length;
        int l=0,r=n-1,ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]<=target){
                if(arr[m]==target){
                    ans=m;
                }
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return ans;
    }
    public int firstOccurance(int[] arr,int target){
        int n=arr.length;
        int l=0,r=n-1,ans=-1;
        while(l<=r){
            int m= l+(r-l)/2;
            if(arr[m]>=target){
                r=m-1;
                if(arr[m]==target){
                    ans=m;
                }
            }else{
                l=m+1;
            }
        }
        return ans;
    }
}