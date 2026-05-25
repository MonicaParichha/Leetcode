class Solution {
    public int myAtoi(String s) {
        long ans=0;
        int signNeg=1;
        s=s.trim();

        if(s.length()>0){
            if(s.charAt(0)=='-'){
                signNeg=-1;
                if(s.length()>1) s=s.substring(1);
            } 
            else if(s.charAt(0)=='+'){
                signNeg=1;
                if(s.length()>1) s=s.substring(1);
            }
        }
        ans=helper(s,ans,signNeg);
       
        return (int)ans * signNeg;
    }
    public long helper(String s, long ans, int n){
        if(s.isEmpty()){
            return ans;
        }
        char ch=s.charAt(0);

        if(!Character.isDigit(ch)){
            return ans;
        } 
        
        ans=(long)ans*10+ (ch-'0');

        if(ans*n<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(ans*n>Integer.MAX_VALUE) return Integer.MAX_VALUE;

        

        return helper(s.substring(1),ans,n);
    }
}