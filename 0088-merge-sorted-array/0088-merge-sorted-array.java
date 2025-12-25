class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=0;
        while(i>=0 && j<Math.min(m,n)){
            if(nums1[i]>nums2[j]){
                int temp=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=temp;
            }
            i--;
            j++;
        }
       for(int k=0;k<n;k++){
            nums1[m+k]=nums2[k];
        }
        Arrays.sort(nums1);


    }
}