class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0,h=n-1,m=0;
        while(m<=h){
            if(nums[m]==0){
                swap(nums,l,m);
                l++;
                m++;
            }
            else if(nums[m]==2){
                swap(nums,m,h);
                h--;
            }
            else{
                m++;
            }
        }   
    }
    public void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}