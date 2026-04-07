class Solution {
    public int numberOfSubstrings(String s) {
        int[] hash=new int[3];
        for(int i=0;i<3;i++){
            hash[i]=-1;
        }
        int n=s.length();
        int r=0;
        int count=0;
        while(r<n){
            hash[s.charAt(r)-'a']=r;
            if(hash[0]!=-1 && hash[1]!=-1 && hash[2]!=-1){
                count+=Math.min(Math.min(hash[0],hash[1]),hash[2])+1;
            }
            r++;
        }
        return count;
    }
}