class Solution {
    public int myAtoi(String s) {
        long ans=0;
        s=s.trim();
        int n=s.length();
        int isNegative=1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='-' && i==0){
                isNegative=-1;
            }
            else if(i==0 && s.charAt(i)=='+') isNegative=1;
            else if(s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9){
                ans=ans*10;
                ans+=(s.charAt(i)-'0');

                if(ans*isNegative>Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if(ans*isNegative<Integer.MIN_VALUE) return Integer.MIN_VALUE;    
                
            }else{
                break;
            }
        }

        

        return (int)ans*isNegative;
    }
}