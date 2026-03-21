class Solution {
    public String removeKdigits(String num, int k) {
        List<Character> arr=new ArrayList<>();
        int n=num.length();
        if(k==n){
            return "0";
        }
        
        for(int i=0;i<n;i++){
            while(!arr.isEmpty() && k>0 && ((arr.get(arr.size()-1)-'0') > num.charAt(i)-'0')){
                arr.remove(arr.size()-1);
                k--;
            }
            arr.add(num.charAt(i));
        }
        while(!arr.isEmpty() && k>0){
            arr.remove(arr.size()-1);
            k--;
        }
        if(arr.isEmpty()) return "0";
        
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)=='0' && ans.isEmpty()){
                continue;
            }
            else{
                ans.append(arr.get(i));
            }
        }
        String str=ans.toString();
        return str.equals("")?"0":str;
    }
}