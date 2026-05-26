class Solution {
    public int numberOfSpecialChars(String word) {
        
        int count=0;
        
        HashSet<Character> upper=new HashSet<>();
        HashSet<Character> lower=new HashSet<>();

        int n=word.length();

        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)){
                lower.add(ch);
            }
            else{
                upper.add(ch);
            }
        }

        int m=lower.size();
        for(char ch: lower){
            if(upper.contains((char)(ch-32))){
                count++;
            }
        }
        return count;
    }
}