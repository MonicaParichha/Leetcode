class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash=new int[255];
        for(int i=0;i<255;i++){
            hash[i]=-1;
        }
        int n=s.length();
        int maxLen=0;
        int l=0,r=0;
        while(r<n){
            if(hash[s.charAt(r)]!=-1 && hash[s.charAt(r)]>=l){
                l=hash[s.charAt(r)]+1;
            }
            
            hash[s.charAt(r)]=r;
            maxLen=Math.max(maxLen,r-l+1);
            r++;

            
        }
        return maxLen;
    }
}