class Solution {
    public void sortColors(int[] nums) {
        int l=0,m=0,n=nums.length;
        int h=n-1;
        while(m<=h){
            if(nums[m]==0){
                swap(nums,l,m);
                l++;
                m++;
            }else if(nums[m]==1){
                m++;
            }else{
                swap(nums,m,h);
                h--;
            }
        }
    }
    public void swap(int[] arr, int i, int j){
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}