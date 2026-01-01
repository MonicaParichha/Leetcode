class Solution {
    public int reversePairs(int[] nums) {
        int count=mergeSort(nums,0,nums.length-1);
        return count;
    }

    public int mergeSort(int arr[], int l, int r) {
        // code here
        int count=0;
        if(l>=r){
            return count;
        }

        int mid=(l+r)/2;
        count+=mergeSort(arr,l,mid);
        count+=mergeSort(arr,mid+1,r);
        count+=countReversePairs(arr,l,mid,r);
        merge(arr,l,mid,r);
        return count;
    }
    public void merge(int [] arr, int l, int mid, int r){
        
        int left=l, right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while(left<=mid && right<=r){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=r){
            temp.add(arr[right]);
            right++;
        }
        
        for(int i=l;i<=r;i++){
            arr[i]=temp.get(i-l);
        }
        
    }
    
    public int countReversePairs(int[] arr, int l, int mid, int h){
        int count=0;
        int right=mid+1;
        for(int i=l;i<=mid;i++){
            while(right<=h && (long) arr[i]> 2L*arr[right]){
                right++;
            }
            count+=(right-(mid+1));
        }
        return count;
    }

}