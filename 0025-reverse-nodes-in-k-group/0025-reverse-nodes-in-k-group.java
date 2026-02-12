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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode nextNode=null;
        ListNode prevNode=null;
        ListNode kthNode=null;
        while(temp!=null){
            kthNode=getKthNode(temp,k);
            if(kthNode==null){
                if(prevNode!=null) prevNode.next=temp;
                break;
            }
            nextNode=kthNode.next;
            kthNode.next=null;
            ListNode tempHead=reverse(temp);
            if(prevNode==null){
                head=tempHead;
            }else{
                prevNode.next=tempHead;
            }
            temp.next=nextNode;
            prevNode=temp;
            temp=nextNode;
        }
        return head;
    }

    public ListNode getKthNode(ListNode head,int k){
        ListNode temp=head;
       for(int i=1;i<k;i++){
         if(temp!=null)temp=temp.next;
         else break;
       }
        return temp;
    }

    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode front=head.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=front;
            if(front!=null) front = front.next;
        }
        return prev;
    }
}