class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> arr=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]< nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);

            if(i>=k-1){
                arr.add(nums[dq.peekFirst()]);
            }
        }
        int [] ans=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}