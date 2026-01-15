class Solution {
    public int myAtoi(String s) {
        long ans=0;
        int sign=1;
        s=s.trim();

        int n=s.length();
        
        if(n==0) return 0;

        if(s.charAt(0)=='-') sign=-1;

        int i=(s.charAt(0)=='-' || s.charAt(0)=='+')?1:0;
        
        while(i<n && Character.isDigit(s.charAt(i))){
            
            char ch=s.charAt(i);
            ans=ans*10+(ch-'0');  

            if(sign*ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign*ans<Integer.MIN_VALUE) return Integer.MIN_VALUE; 

              
            i++; 
        }
        

        return (int)ans*sign;

    }

}