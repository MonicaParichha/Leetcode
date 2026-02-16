class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        int index=0;
        int sign=1;
        if(s.charAt(0)=='+' || s.charAt(0)=='-'){
            index++;
            if(s.charAt(0)=='-') sign=-1;
        }
        long ans=0;
        ans=helper(sign,s,index, ans);
        return (int)ans;
    }
    public long helper(int sign, String s,int index, long ans){
        
        if(index>=s.length() || !Character.isDigit(s.charAt(index))) return ans*sign;

        long newAns= (long)((ans*10)+(s.charAt(index)-'0'));

        if(newAns*sign>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(newAns*sign<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        

        return helper(sign,s,index+1,newAns);
    } 
}