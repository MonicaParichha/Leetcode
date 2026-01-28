class Solution {
    public String largestOddNumber(String num) {

        int n=num.length();
        for(int i=n-1;i>=0;i--){
            int x=num.charAt(i)-'0';
            if(x%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}