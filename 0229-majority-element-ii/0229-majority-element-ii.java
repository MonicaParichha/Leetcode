class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int ele1=0,ele2=0,c1=0,c2=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==ele1){
                c1++;
            }else if(nums[i]==ele2){
                c2++;
            }else if(c1==0){
                ele1=nums[i];
                c1++;
            }else if(c2==0){
                ele2=nums[i];
                c2++;
            }else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int num:nums){
            if(num==ele1) c1++;
            else if(num==ele2) c2++;
        }
        
        if(c1>n/3) ans.add(ele1);
        if(c2>n/3) ans.add(ele2);
        return ans;
    }
}