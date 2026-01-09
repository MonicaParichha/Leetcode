class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;

        //n2 length is shorter
        if(n1>n2) return findMedianSortedArrays(nums2,nums1);

        //n1 is shorter
        int l=0;
        int r=n1;
        int left=(n1+n2+1)/2;
        while(l<=r){
            int m1=l+(r-l)/2;
            int m2=left-m1;
            int l1=(m1==0)?Integer.MIN_VALUE: nums1[m1-1];
            int l2=(m2==0)?Integer.MIN_VALUE: nums2[m2-1];
            int r1=(m1==n1)?Integer.MAX_VALUE: nums1[m1];
            int r2=(m2==n2)?Integer.MAX_VALUE: nums2[m2];

            if(l1<=r2 && l2<=r1){
                if((n1+n2)%2==0){
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }else{
                    return Math.max(l1,l2);
                }

            }else if(l1>r2){
                r=m1-1;
            }else{
                l=m1+1;
            }  
        }
        return 0.0;
    }


    // 1 2 4 |  5 7 8
    // 2 3 3 |  3 5 6
}