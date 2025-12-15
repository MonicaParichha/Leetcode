class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        int c1=0, c2=0, ele1=0, ele2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==ele1){
                c1++;
            }
            else if(nums[i]==ele2){
                c2++;
            }
            else if(c1==0){
                ele1=nums[i];
                c1++;
            }
            else if(c2==0){
                ele2=nums[i];
                c2++;
            } 
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<n;i++){
            if(ele1==nums[i]){
                c1++;
            }if(ele2==nums[i]){
                c2++;
            }
        }
        int mj=n/3;

        if(c1>mj){
            ans.add(ele1);
        }
        if(c2>mj && ele1!=ele2){
            ans.add(ele2);
        }
        return ans;
    }
}