class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int count=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int c=1;
                int ele=n;

                while(set.contains(ele+1)){
                    c++;
                    ele++;
                }
                count=Math.max(c,count);
            }
        }
        return count;
    }
}