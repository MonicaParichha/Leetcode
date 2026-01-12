class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder ans=new StringBuilder();
        int n=s.length();
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