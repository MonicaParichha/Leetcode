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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return head;

        ListNode oddHead=head;
        ListNode evenHead=head.next;
        ListNode tempEvenHead=evenHead;
        while(oddHead.next!=null && tempEvenHead.next!=null){
            oddHead.next=oddHead.next.next;
            if(oddHead.next!=null) oddHead=oddHead.next;
            tempEvenHead.next=tempEvenHead.next.next;
            if(tempEvenHead.next!=null) tempEvenHead=tempEvenHead.next;
        }
        oddHead.next=evenHead;
        return head;
    }
}