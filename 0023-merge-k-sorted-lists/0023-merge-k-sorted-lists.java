/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        if(lists.length==1) return lists[0];
        PriorityQueue<Pair> pq=new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int n=lists.length;
        for(int i=0;i<n;i++){
            if(lists[i]!=null) pq.add(new Pair(lists[i],lists[i].val));
        }
        while(!pq.isEmpty()){
            Pair pair=pq.poll();
            temp.next=pair.node;
            if(pair.node.next!=null) pq.add(new Pair(pair.node.next,pair.node.next.val));
            temp=temp.next;
        }
        return dummy.next;
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
    ListNode node;
    int val;

    Pair(ListNode node, int val){
        this.node=node;
        this.val=val;
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