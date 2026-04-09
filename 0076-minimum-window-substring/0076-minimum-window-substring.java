class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map=new HashMap<>();
        int m=t.length();
        int n=s.length();
        int count=0, sIndex=-1, minLen=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int l=0, r=0;
        while(r<n){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)-1);
            if(map.get(s.charAt(r))>=0){
                count++;
            }
            while(m==count){
                if(r-l+1<minLen){
                    minLen=r-l+1;
                    sIndex=l;
                }
                map.put(s.charAt(l),map.get(s.charAt(l))+1);
                if(map.get(s.charAt(l))>0) count--;

                l++;
            }
            r++;
        }
        return sIndex==-1?"":s.substring(sIndex,sIndex+minLen);
    }
}