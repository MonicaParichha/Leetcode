class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0,m=0,r=n-1;
        while(m<=r){
            if(nums[m]==0){
                swap(nums,m,l);
                l++;
                m++;
            }else if(nums[m]==2){
                swap(nums,m,r);
                r--;
            }else{
                m++;
            }
        }
    }
    public void swap(int [] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}