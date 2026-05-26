class Solution {
    public int numberOfSpecialChars(String word) {
        int n=word.length();
        int count=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(word.charAt(i));
        }
        for(int i=0;i<n;i++){
            if(word.charAt(i)>='a' && word.charAt(i)<='z'){
                if(set.contains((char)(word.charAt(i) - 32))){
                    count++;
                }
                set.remove((char)(word.charAt(i) - 32));
            }
            else{
                if(set.contains((char)(word.charAt(i) + 32))){
                    count++;
                }
                set.remove((char)(word.charAt(i) + 32));
            }
        }

        return count/2;
    }
}