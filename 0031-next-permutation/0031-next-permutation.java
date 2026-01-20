class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        boolean flag=false;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                flag=true;
                int index=findMinIndex(nums,nums[i],i);
                swap(nums,i,index);
                rev(nums,i+1,n-1);
                break;
            }
        }
        if(!flag){
            rev(nums,0,n-1);
        }
    }
    public void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void rev(int [] arr,int i, int j){
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public int findMinIndex(int []arr,int num,int end){
        int n=arr.length;
        for(int i=n-1;i>=end;i--){
            if(arr[i]>num){
                return i;
            }
        }
        return -1;
    }
}