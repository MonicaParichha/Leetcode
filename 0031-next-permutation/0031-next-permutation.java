class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                int minIndex=findMin(nums,i,n-1);
                if(minIndex!=-1){
                    swap(nums,i-1,minIndex);
                }
                rev(nums,i,n-1);
                return;
            }
        }
        rev(nums,0,n-1);
    }
    public int findMin(int[] arr, int i, int j){
        int ans=Integer.MAX_VALUE;
        int index=-1;
        for(int k=i;k<=j;k++){
            if(arr[k]>arr[i-1] && arr[k]<=ans){
                ans=arr[k];
                index=k;
            }
        }
        return index;
    }
    public void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void rev(int[] arr, int i, int j){
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}