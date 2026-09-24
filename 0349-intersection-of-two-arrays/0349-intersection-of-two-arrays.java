class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0,j=0;

        ArrayList<Integer> arr=new ArrayList<>();

        while(i<m && j<n){
            if((arr.isEmpty() || !arr.contains(nums1[i])) && nums1[i]==nums2[j]){
                arr.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        
        int len=arr.size();
        int [] ans=new int[len];
        for(int k=0;k<len;k++){
            ans[k]=arr.get(k);
        }
        return ans;
    }
}