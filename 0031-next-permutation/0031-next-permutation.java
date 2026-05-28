class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        boolean isThere=false;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                int min=findMin(nums,i-1,n-1);
                if(min!=-1) swap(nums,min,i-1);
                reverse(nums,i,n-1);
                isThere=true;
                break;
            }
        }
        if(!isThere){
            reverse(nums,0,n-1);
        }
    }
    public int findMin(int[] arr, int i, int j){
        int ans=-1;
        for(int s=j;s>i;s--){
            if(arr[i]<arr[s]){
                ans=s;
                break;
            }
        }
        return ans;
    }
    public void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void reverse(int[] arr, int i, int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
}