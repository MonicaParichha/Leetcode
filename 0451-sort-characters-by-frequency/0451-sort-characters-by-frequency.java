class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character> arr=new ArrayList<>(map.keySet());
        arr.sort((a,b)->Integer.compare(map.get(b),map.get(a)));

        StringBuilder sb=new StringBuilder();

        for(char ch: arr){
            int len=map.get(ch);
            for(int i=0;i<len;i++){
                sb.append(ch);
            }
        }
        return sb.toString();

    }
}