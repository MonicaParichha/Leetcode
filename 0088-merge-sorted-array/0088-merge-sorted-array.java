class Solution {
    public void merge(int[] arr1, int n, int[] arr2, int m) {
        int len=m+n;

        // Gap method - Shell Sort
        int gap=(len/2) + (len%2);
        
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<len){
                //arr1 and arr2
                if(left<n && right>=n){
                    swap(arr1, arr2, left, right-n);
                }
                //arr2 and arr2
                else if(left>=n){
                    swap(arr2, arr2, left-n, right-n);
                }
                //arr1 and arr1
                else{
                    swap(arr1, arr1, left, right);
                }
                left++;
                right++;
            }
            if(gap==1) break;
            gap=(gap/2)+(gap%2);
        }
        for(int i=0;i<m;i++){
            arr1[n+i]=arr2[i];
        }
    }


    public void swap(int [] arr1, int[] arr2, int i, int j){
        if(arr1[i]>arr2[j]){
            int temp=arr1[i];
            arr1[i]=arr2[j];
            arr2[j]=temp;
        }
    }
}