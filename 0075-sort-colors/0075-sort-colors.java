class Solution {
    public void sortColors(int[] nums) {
        int l=0,m=0;
        int n=nums.length;
        int h=n-1;
        while(m<=h){
            if(nums[m]==2){
                swap(nums,m,h);
                h--;
            }else if(nums[m]==0){
                swap(nums,m,l);
                l++;
                m++;
            }else{
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