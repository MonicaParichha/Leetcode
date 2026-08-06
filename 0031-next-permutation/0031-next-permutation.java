class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        boolean flag=false;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                flag=true;
                int index=smallestIndex(nums,n-1,i,i-1);
                if(index==-1) return; 
                swap(nums,i-1,index);
                rev(i,n-1,nums);
                return;
            }
        }
        if(flag==false) rev(0,n-1,nums);
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int smallestIndex(int[] arr, int i, int j, int ind){
        for(int k=i;k>0;k--){
            if(arr[ind]<arr[k]){
                return k;
            }
        }
        return -1;
    }
    public void rev(int i, int j, int[] nums){
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}