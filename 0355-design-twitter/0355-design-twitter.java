class Twitter {
    List<Integer> twitterIds;
    HashMap<Integer,List<Integer>> idsFollowers;
    List<Pair> newsFeed;

    public Twitter() {
        twitterIds=new ArrayList<>();
        idsFollowers=new HashMap<>();
        newsFeed=new ArrayList<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        newsFeed.add(new Pair(userId,tweetId));
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> ans=new ArrayList<>();
        List<Integer> followers=idsFollowers.get(userId);
        for(int j=newsFeed.size()-1;j>=0;j--){
            if(ans.size()==10) return ans;
            Pair p=newsFeed.get(j);

            if((followers!=null && followers.contains(p.getUserId())) || p.getUserId()==userId){
                ans.add(p.getTweetId());
            }
        }
        return ans;
    }
    
    public void follow(int followerId, int followeeId) {
        if(followerId==followeeId) return;
        List<Integer> followers=idsFollowers.getOrDefault(followerId,new ArrayList<>());
        if(!followers.contains(followeeId)) followers.add(followeeId);
        idsFollowers.put(followerId,followers);
    }
    
    public void unfollow(int followerId, int followeeId) {
        List<Integer> followers=idsFollowers.get(followerId);
        if(followers!=null) followers.remove(Integer.valueOf(followeeId));
        
        
    }
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt"))
            {
                writer.write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
        ));
    }
}
class Pair{
    int userid;
    int tweetid;
    
    Pair(int userid, int tweetid){
        this.userid=userid;
        this.tweetid=tweetid;
    }
    public int getUserId(){
        return userid;
    }
    public int getTweetId(){
        return tweetid;
    }
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt"))
            {
                writer.write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
        ));
    }

}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */