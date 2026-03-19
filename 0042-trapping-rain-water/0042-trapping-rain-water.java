class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0,r=n-1;
        int lMax=0,rMax=0,total=0;
        while(l<=r){
            if(height[l]<=height[r]){
                if(height[l]<lMax){
                    total+=(lMax-height[l]);
                }
                lMax=Math.max(lMax,height[l]);
                l++;
            }else{
                if(height[r]<rMax){
                    total+=(rMax-height[r]);
                }
                rMax=Math.max(rMax,height[r]);
                r--;
            }
        }
        return total;
    }
}