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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode prev=head;
        ListNode slow=head;
        ListNode fast=head;
        int n=length(head);
        
        k=k%n;
        if(k==0) return head;
        while(fast!=null && k>1){
            fast=fast.next;
            k--;
        }
        if(fast==null || fast.next==null) return fast;
        while(fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
        fast.next=head;
        return slow;

    }
    public int length(ListNode head){
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
}