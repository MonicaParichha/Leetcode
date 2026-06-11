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
        int n=lists.length;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->Integer.compare(a.val, b.val));

        for(int i=0;i<n;i++){
            if(lists[i]!=null){
                ListNode node= lists[i];
                int val=lists[i].val;
                pq.add(new Pair(node,val));
            }

            
        }

        ListNode head=new ListNode();
        ListNode l=head;

        while(!pq.isEmpty()){
            Pair p=pq.poll();
            l.next=p.first();
            l=l.next;
            if(p.first().next!=null){
                pq.add(new Pair(p.first().next, p.first().next.val));
            }
        }

        return head.next;
    }

}
class Pair{
    ListNode node;
    int val;
    Pair(ListNode node, int val){
        this.node=node;
        this.val=val;
    }
    public ListNode first(){
        return node;
    }
    public int second(){
        return val;
    }
}