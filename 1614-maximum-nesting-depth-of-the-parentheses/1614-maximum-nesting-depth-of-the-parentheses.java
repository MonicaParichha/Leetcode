class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int ob=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                ob++;
            }else if(s.charAt(i)==')'){
                ans=Math.max(ob,ans);
                ob--;
            }
        }
        return ans;
    }
}