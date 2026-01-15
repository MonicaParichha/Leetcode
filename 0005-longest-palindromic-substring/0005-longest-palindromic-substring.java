class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int st=0,e=0;
        int maxLen=0;
        for(int c=0;c<n;c++){
            int odd=expand(s,c,c);
            int even=expand(s,c,c+1);
            maxLen=Math.max(odd,even);
            if(maxLen>e-st){
                st=c-(maxLen-1)/2;
                e=c+maxLen/2;
            }
        }
        return s.substring(st,e+1);
    }
    public int expand(String s,int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}