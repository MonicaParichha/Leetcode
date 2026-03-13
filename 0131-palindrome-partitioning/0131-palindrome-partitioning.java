class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> arr=new ArrayList<>();
        solve(0,s,arr,ans);
        return ans;
    }
    public void solve(int ind,String s,List<String> arr, List<List<String>> ans){
        if(ind==s.length()){
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(isPalindrome(s,ind,i)){
                arr.add(s.substring(ind,i+1));
                solve(i+1,s,arr,ans);
                arr.remove(arr.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int st, int e){
        while(st<=e){
            if(s.charAt(st)!=s.charAt(e)){
                return false;
            }
            st++;
            e--;
        }
        return true;
    }

}