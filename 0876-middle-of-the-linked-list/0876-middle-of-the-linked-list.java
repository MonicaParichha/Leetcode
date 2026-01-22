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
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        int len=getLength(head);
        ListNode ans=(len%2==0)?slow.next:slow;
        return ans;        
    }
    public int getLength(ListNode head){
        ListNode node=head;
        int c=0;
        while(node!=null){
            node=node.next;
            c++;
        }
        return c;
    }
}