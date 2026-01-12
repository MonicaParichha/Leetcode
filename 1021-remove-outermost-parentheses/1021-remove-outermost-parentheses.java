class Solution {
    public String removeOuterParentheses(String s) {
        if(s=="") return "";
        int n=s.length();
        int count=0;
        StringBuilder ans=new StringBuilder();
        
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                if(count>0) ans.append(s.charAt(i));
                count++;
            }
            else{
                count--;
                if(count>0) ans.append(s.charAt(i));
            }
            
        }
        return ans.toString();
        
    }
}