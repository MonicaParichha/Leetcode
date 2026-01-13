class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(m!=n) return false;
        char[] arr1=s.toCharArray();
        Arrays.sort(arr1);
        char[] arr2=t.toCharArray();
        Arrays.sort(arr2);
        s=new String(arr1);
        t=new String(arr2);
        return s.equals(t);
    }
}