class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length;
        if(n==0) return "";
        String first=strs[0];
        String last=strs[n-1];
        int minLen=first.length();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<minLen;i++){
            if(first.charAt(i)==last.charAt(i)){
                sb.append(first.charAt(i));
            }else{
                return sb.toString();
            }
        }
        return sb.toString();      
    }
}